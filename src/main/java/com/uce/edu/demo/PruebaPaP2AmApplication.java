package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AmApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService iPropietarioService;

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Propietario p1 = new Propietario();
		p1.setNombre("Ariel");
		p1.setApellido("Maldonado");
		p1.setCedula("1750844787");

		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Audi");
		v1.setModelo("R8");
		v1.setPlaca("PCJ-6064");
		v1.setPrecio(new BigDecimal(2500));
		v1.setTipo("Ligero");

		// 1. Crear un propietario
		System.out.println("\n1. Crear un propietario: ");
		this.iPropietarioService.insertarNuevo(p1.getNombre(), p1.getApellido(), p1.getCedula());

		// 2. Crear un vehiculo
		System.out.println("\n2. Crear un vehiculo: ");
		this.iVehiculoService.insertar(v1);

		// 3. Actualizar un atributo de vehiculo
		System.out.println("\n3. Actualizar un vehiculo: ");
		v1.setModelo("Q3");
		v1.setPrecio(new BigDecimal(15000));
		this.iVehiculoService.actualizar(v1);

		// 4. Realizar una matricula
		System.out.println("\n4. Realizar una matricula: ");
		Matricula m = this.iMatriculaService.matricularVehiculo(p1.getCedula(), v1.getPlaca());
		
		

	}

}
