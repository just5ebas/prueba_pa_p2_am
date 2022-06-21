package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	
	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos la matricula: " + m);
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos la matricula: " + m);
	}

	@Override
	public Matricula buscar(String prop, String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base de datos la matricula: " + m);
	}

}
