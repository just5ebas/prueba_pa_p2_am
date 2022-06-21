package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioService {

	public void insertarNuevo(String nombre, String apellido, String cedula);

	public void actualizarInformacion(Propietario p);

	public Propietario buscarPropietario(String cedula);

	public void eliminarPropietario(Propietario p);

}
