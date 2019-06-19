package com.hernandez.hibernate.service;

import java.util.List;

import com.hernandez.hibernate.model.Materia;

public interface MateriaService {

	Materia findById(int id);

	Materia findByType(String type);
	
	List<Materia> findAll();
}
