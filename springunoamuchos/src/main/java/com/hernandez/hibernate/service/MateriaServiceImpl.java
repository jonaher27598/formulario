package com.hernandez.hibernate.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hernandez.hibernate.dao.MateriaDao;
import com.hernandez.hibernate.model.Materia;


@Service("MateriaService")
@Transactional
public class MateriaServiceImpl implements MateriaService {
	@Autowired
	MateriaDao dao;
	
	public Materia findById(int id) {
		return dao.findById(id);
	}

	public Materia findByType(String type){
		return dao.findByType(type);
	}

	public List<Materia> findAll() {
		return dao.findAll();
	}
}
