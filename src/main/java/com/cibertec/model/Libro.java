package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_libro")
public class Libro {

	@Id
	@Column(name = "idlibro")
	private int codlibro;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "precio")
	private double precio;

	@Column(name = "ejemplares")
	private int ejemplares;

	@Column(name = "origen")
	private String origen;

	@Column(name = "idtema")
	private int codtema;

	public int getCodlibro() {
		return codlibro;
	}
	
	
	
	
	

	public void setCodlibro(int codlibro) {
		this.codlibro = codlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getCodtema() {
		return codtema;
	}

	public void setCodtema(int codtema) {
		this.codtema = codtema;
	}

}
