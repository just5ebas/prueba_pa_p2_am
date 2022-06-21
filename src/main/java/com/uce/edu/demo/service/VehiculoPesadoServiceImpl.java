package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
@Qualifier("vehiculo_pesado")
public class VehiculoPesadoServiceImpl implements IVehiculoService {

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
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.12));
		if (valorMatricula.compareTo(new BigDecimal(2000)) > 0) {
			BigDecimal dscto = valorMatricula.multiply(new BigDecimal(0.07));
			valorMatricula = valorMatricula.subtract(dscto);
		}
		return valorMatricula;
	}

}
