package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	public void insertar(Matricula m);

	public void actualizar(Matricula m);

	public Matricula buscar(String prop, String placa);

	public void eliminar(Matricula m);
}
