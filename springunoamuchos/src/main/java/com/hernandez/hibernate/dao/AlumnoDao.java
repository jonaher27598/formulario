package com.hernandez.hibernate.dao;

import java.util.List;

import com.hernandez.hibernate.model.Alumno;


public interface AlumnoDao {
	Alumno findById(int id);
	void save(Alumno alum);	
	List<Alumno> findAllUsers();
}
