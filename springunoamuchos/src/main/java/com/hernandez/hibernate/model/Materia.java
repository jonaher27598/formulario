package com.hernandez.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mate")
	private int id_mate;

	@Column(name = "nombre")
	private String nombre;

	public Materia(int id_mate, String nombre) {
		super();
		this.id_mate = id_mate;
		this.nombre = nombre;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_mate;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Materia other = (Materia) obj;
		if (id_mate != other.id_mate)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "MateriaDetails [id_mate=" + id_mate + ", nombre=" + nombre + "]";
	}

	public int getId_mate() {
		return id_mate;
	}

	public void setId_mate(int id_mate) {
		this.id_mate = id_mate;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
