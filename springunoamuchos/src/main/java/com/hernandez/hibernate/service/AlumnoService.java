package com.hernandez.hibernate.service;

import java.util.List;

import com.hernandez.hibernate.model.Alumno;

public interface AlumnoService {

	Alumno findById(int id);

	void saveUser(Alumno alum);

	List<Alumno> findAllUsers();

}
