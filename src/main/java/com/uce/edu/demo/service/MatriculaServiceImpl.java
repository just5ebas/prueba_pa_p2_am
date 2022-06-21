package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	@Qualifier("vehiculo_ligero")
	private IVehiculoService iVehiculoRepositoryLigero;

	@Autowired
	@Qualifier("vehiculo_pesado")
	private IVehiculoService iVehiculoRepositoryPesado;

	@Override
	public Matricula matricularVehiculo(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario p = this.iPropietarioRepository.buscar(cedula);
		Vehiculo v = this.iVehiculoRepository.buscar(placa);

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(p);
		m.setVehiculo(v);

		BigDecimal valorMatricula = this.calcularValorMatricula(v.getTipo(), placa);
		m.setValorMatricula(valorMatricula);

		this.iMatriculaRepository.insertar(m);

		return m;
	}

	@Override
	public BigDecimal calcularValorMatricula(String tipo, String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = this.iVehiculoRepository.buscar(placa);
		BigDecimal valorMatricula = null;
		if (tipo.equalsIgnoreCase("Ligero")) {
			valorMatricula = this.iVehiculoRepositoryLigero.valorMatricula(v.getPrecio());
		} else if (tipo.equalsIgnoreCase("Pesado")) {
			valorMatricula = this.iVehiculoRepositoryPesado.valorMatricula(v.getPrecio());
		}
		// Con la siguiente linea aproximo a dos decimales.
		valorMatricula = valorMatricula.setScale(2, RoundingMode.HALF_UP);
		return valorMatricula;
	}

	@Override
	public void eliminarPropietario(Matricula m) {
		// TODO Auto-generated method stub
		m.setPropietario(null);
		this.iMatriculaRepository.actualizar(m);
	}

}
