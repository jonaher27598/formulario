package com.hernandez.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alum")
	private int id_alum;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edad")
	private int edad;
	@ManyToMany
	@JoinTable(name = "config", joinColumns = @JoinColumn(name = "fkalum"), inverseJoinColumns = @JoinColumn(name = "fkmate"))
	private Set<Materia> materia  = new HashSet<Materia>();

	
	public int getId_alum() {
		return id_alum;
	}

	public void setId_alum(int id_alum) {
		this.id_alum = id_alum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public Set<Materia> getMateria() {
		return materia;
	}

	public void setMateria(Set<Materia> materia) {
		this.materia = materia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_alum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (id_alum != other.id_alum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [id_alum=" + id_alum + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", materia=" + materia + "]";
	}



	


}
