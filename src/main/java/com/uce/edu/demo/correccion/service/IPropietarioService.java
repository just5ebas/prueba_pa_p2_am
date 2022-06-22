package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.modelo.Propietario;

public interface IPropietarioService {

	public void crear(Propietario p);

	public void eliminar(String cedula);
	
}
