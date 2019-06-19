package com.hernandez.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hernandez.hibernate.model.Materia;

@Repository("MateriaDao")
public class MateriaDaoImpl extends AbstractDao<Integer, Materia>implements MateriaDao {
	public Materia findById(int id) {
		return getByKey(id);
	}

	public Materia findByType(String type) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("nombre", type));
		return (Materia) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Materia> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("type"));
		return (List<Materia>)crit.list();
	}
}
