package com.hernandez.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hernandez.hibernate.model.Alumno;
import com.hernandez.hibernate.model.Materia;
import com.hernandez.hibernate.service.AlumnoService;
import com.hernandez.hibernate.service.MateriaService;


@Controller
@RequestMapping("/")
@SessionAttributes
public class AppController {
	@Autowired
	AlumnoService alumnoService;

	@Autowired
	MateriaService materiaService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<Alumno> users = alumnoService.findAllUsers();
		model.addAttribute("users", users);
		return "userslist";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		Alumno alum = new Alumno();
		model.addAttribute("user", alum);
		model.addAttribute("edit", false);
		return "registration";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(@Validated Alumno alum, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		alumnoService.saveUser(alum);

		model.addAttribute("success", "User " + alum.getNombre() + " " + alum.getApellido() + "" + alum.getEdad()
				+ " registered successfully");
		// return "success";
		return "registrationsuccess";
	}
	@ModelAttribute("roles")
	public List<Materia> initializeProfiles() {
		return materiaService.findAll();
	}

}