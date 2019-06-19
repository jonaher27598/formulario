package com.hernandez.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hernandez.hibernate.dao.AlumnoDao;
import com.hernandez.hibernate.model.Alumno;

@Service("AlumnoService")
@Transactional
public class AlumnoServiceImpl {
	@Autowired
	private AlumnoDao dao;

	public Alumno findById(int id) {
		return dao.findById(id);
	}


	public void saveUser(Alumno alum) {
		dao.save(alum);
	}
	public List<Alumno> findAllUsers() {
		return dao.findAllUsers();
	}
}
