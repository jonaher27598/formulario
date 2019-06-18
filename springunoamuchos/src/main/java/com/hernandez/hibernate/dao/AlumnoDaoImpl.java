package com.hernandez.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.hernandez.hibernate.model.Alumno;



@Repository("AlumnoDAO")
public class AlumnoDaoImpl  extends AbstractDao<Integer, Alumno> implements AlumnoDao  {
	public Alumno findById(int id) {
		Alumno alum = getByKey(id);
		if(alum!=null){
			Hibernate.initialize(alum.getMateria());
		}
		return alum;
	}
	@SuppressWarnings("unchecked")
	public List<Alumno> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("nombre"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Alumno> alumno = (List<Alumno>) criteria.list();
		return alumno;
	}

	public void save(Alumno alum) {
		persist(alum);
	}
}
