package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo v);

	public void actualizar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void eliminar(Vehiculo v);

}
