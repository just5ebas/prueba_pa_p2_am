package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.modelo.Vehiculo;
import com.uce.edu.demo.correccion.service.IMatriculaGestorService;
import com.uce.edu.demo.correccion.service.IPropietarioService;
import com.uce.edu.demo.correccion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AmApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IPropietarioService iPropietarioService;

	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1. crear vehiculo
		Vehiculo v = new Vehiculo();
		v.setMarca("Totota");
		v.setPlaca("PCJ-6064");
		v.setPrecio(new BigDecimal(50000));
		v.setTipo("P");

		this.iVehiculoService.insertar(v);

		// 2. Actualizar vehiculo
		v.setPrecio(new BigDecimal(4000));
		v.setMarca("Toyota");

		this.iVehiculoService.actualizar(v);

		// 3. Crear propietario
		Propietario p = new Propietario();
		p.setNombre("Ariel");
		p.setApellido("Maldonado");
		p.setCedula("1750844787");
		p.setFechaNacimiento(LocalDateTime.of(2000, 12, 26, 0, 5));

		this.iPropietarioService.crear(p);

		// 4. Crear matricula
		this.iMatriculaGestorService.generar(p.getCedula(), v.getPlaca());

	}

}
