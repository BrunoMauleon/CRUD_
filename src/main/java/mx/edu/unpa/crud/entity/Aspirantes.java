package mx.edu.unpa.crud.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="datos_aspirantes")
public class Aspirantes implements Serializable{
		private static final long serialVersionUID = -6053376254762711089L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="idPerson")
		private Long id;
		private String CURP;
		private String nombre;
		private String apellidoP;
		private String apellidoM;
		private int telefono;
		private String correo;
		private Date fecha_nacimiento;
		private int nss;
		
		
		private String nacionalidad;
		private String estado;
		private String municipio;
		private int codigo_postal;
		
		
		private String escuela_procedencia;
		private String especialidad_cursada;
		private String carrera1;
		private String carrera2;

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCURP() {
			return CURP;
		}

		public void setCURP(String cURP) {
			CURP = cURP;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidoP() {
			return apellidoP;
		}

		public void setApellidoP(String apellidoP) {
			this.apellidoP = apellidoP;
		}

		public String getApellidoM() {
			return apellidoM;
		}

		public void setApellidoM(String apellidoM) {
			this.apellidoM = apellidoM;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public Date getFecha_nacimiento() {
			return fecha_nacimiento;
		}

		public void setFecha_nacimiento(Date fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}

		public int getNss() {
			return nss;
		}

		public void setNss(int nss) {
			this.nss = nss;
		}

		


		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		
		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getMunicipio() {
			return municipio;
		}

		public void setMunicipio(String municipio) {
			this.municipio = municipio;
		}

		public int getCodigo_postal() {
			return codigo_postal;
		}

		public void setCodigo_postal(int codigo_postal) {
			this.codigo_postal = codigo_postal;
		}

		public String getEscuela_procedencia() {
			return escuela_procedencia;
		}

		public void setEscuela_procedencia(String escuela_procedencia) {
			this.escuela_procedencia = escuela_procedencia;
		}

		public String getEspecialidad_cursada() {
			return especialidad_cursada;
		}

		public void setEspecialidad_cursada(String especialidad_cursada) {
			this.especialidad_cursada = especialidad_cursada;
		}

		public String getCarrera1() {
			return carrera1;
		}

		public void setCarrera1(String carrera1) {
			this.carrera1 = carrera1;
		}

		public String getCarrera2() {
			return carrera2;
		}

		public void setCarrera2(String carrera2) {
			this.carrera2 = carrera2;
		}

}