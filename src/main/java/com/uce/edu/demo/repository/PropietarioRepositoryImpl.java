package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos al propietario: " + p);
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos al propietario: " + p);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setNombre("Ariel");
		p.setApellido("Maldonado");
		p.setCedula("1750844787");
		return p;
	}

	@Override
	public void eliminar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base de datos al propietario: " + p);
	}

}
