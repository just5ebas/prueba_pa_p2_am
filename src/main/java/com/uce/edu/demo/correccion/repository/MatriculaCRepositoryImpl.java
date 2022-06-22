package com.uce.edu.demo.correccion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Matricula;

@Repository
public class MatriculaCRepositoryImpl implements IMatriculaRepository {

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos la matricula " + m);
	}

}
