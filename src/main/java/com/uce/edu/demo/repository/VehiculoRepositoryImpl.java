package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base de datos al vehiculo: " + v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos al vehiculo: " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		v.setMarca("Audi");
		v.setModelo("Q3");
		v.setPlaca(placa);
//		v.setPrecio(new BigDecimal(7000));
		v.setPrecio(new BigDecimal(15000));
//		v.setTipo("Pesado");
		v.setTipo("Ligero");
		return v;
	}

	@Override
	public void eliminar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino en la base de datos al vehiculo: " + v);
	}

}
