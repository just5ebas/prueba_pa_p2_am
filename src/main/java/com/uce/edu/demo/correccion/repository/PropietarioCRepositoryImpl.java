package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Propietario;

@Repository
public class PropietarioCRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se creo al propietario " + p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino al propietario de cedula " + cedula);

	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setCedula(cedula);
		p.setNombre("Ariel");
		p.setApellido("Maldonado");
		p.setFechaNacimiento(LocalDateTime.of(2000, 12, 26, 0, 5));

		return p;
	}

}
