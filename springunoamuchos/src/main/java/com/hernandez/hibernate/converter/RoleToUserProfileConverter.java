package com.hernandez.hibernate.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hernandez.hibernate.model.Materia;
import com.hernandez.hibernate.service.MateriaService;

@Component
public class RoleToUserProfileConverter {
	@Autowired
	MateriaService materiaProfileService;

	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public Materia convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		Materia profile= materiaProfileService.findById(id);
		System.out.println("Profile : "+profile);
		return profile;
	}
}
