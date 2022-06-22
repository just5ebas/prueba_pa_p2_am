package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.repository.IPropietarioRepository;

@Service
public class PropietarioCServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.crear(p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
