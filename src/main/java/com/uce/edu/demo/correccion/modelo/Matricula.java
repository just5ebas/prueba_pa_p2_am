package com.uce.edu.demo.correccion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {

	private LocalDateTime fechaMatricula;
	private BigDecimal valor;
	private Propietario propietario;
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}

	// GET & SET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
