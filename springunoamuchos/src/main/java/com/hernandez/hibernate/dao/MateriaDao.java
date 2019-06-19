package com.hernandez.hibernate.dao;

import java.util.List;

import com.hernandez.hibernate.model.Materia;


public interface MateriaDao {
List<Materia> findAll();
	
	Materia findByType(String type);
	
	Materia findById(int id);
}
