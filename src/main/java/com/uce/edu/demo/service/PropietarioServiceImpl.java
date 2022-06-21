package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void insertarNuevo(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setCedula(cedula);
		this.iPropietarioRepository.insertar(p);
	}

	@Override
	public void actualizarInformacion(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(p);
	}

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(cedula);
	}

	@Override
	public void eliminarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(p);
	}

}
