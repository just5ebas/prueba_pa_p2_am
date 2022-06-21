package com.uce.edu.demo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void insertar(Vehiculo v);

	public void actualizar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void eliminar(Vehiculo v);
	
	public BigDecimal valorMatricula(BigDecimal precio);

}
