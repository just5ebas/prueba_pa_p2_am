package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario p);

	public void actualizar(Propietario p);

	public Propietario buscar(String cedula);

	public void eliminar(Propietario p);

}
