package com.example.hibernateDesafio1.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRATO")
public class Contrato {

	private Long id;
	
	private String fecha_vigencia;
	
	private String fecha_caducidad;
	
	private Double precio_mensual;
	
	private Cliente cliente;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTRATO", precision = 15)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "FECHA_VIGENCIA", nullable = false, length = 50)
	public String getFecha_vigencia() {
		return fecha_vigencia;
	}

	public void setFecha_vigencia(String fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}

	@Column(name = "FECHA_CADUCIDAD", nullable = false, length = 50)
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	@Column(name = "PRECIO_MENSUAL", nullable = false, precision = 10)
	public Double getPrecio_mensual() {
		return precio_mensual;
	}

	public void setPrecio_mensual(Double precio_mensual) {
		this.precio_mensual = precio_mensual;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}