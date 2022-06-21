package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
@Primary
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void eliminar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(v);
	}

	@Override
	public BigDecimal valorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
