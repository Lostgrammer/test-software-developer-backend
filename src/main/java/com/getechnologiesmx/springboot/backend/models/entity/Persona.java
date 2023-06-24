package com.getechnologiesmx.springboot.backend.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Persona {
	@Entity
	@Table(name = "personas")
	public class Directorio implements Serializable {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		private String nombre;
		private String apellidoPaterno;
		private String apellidoMaterno;
		private String identificacion;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidoPaterno() {
			return apellidoPaterno;
		}

		public void setApellidoPaterno(String apellidoPaterno) {
			this.apellidoPaterno = apellidoPaterno;
		}

		public String getApellidoMaterno() {
			return apellidoMaterno;
		}

		public void setApellidoMaterno(String apellidoMaterno) {
			this.apellidoMaterno = apellidoMaterno;
		}

		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		private static final long serialVersionUID = 1L;
	}
}