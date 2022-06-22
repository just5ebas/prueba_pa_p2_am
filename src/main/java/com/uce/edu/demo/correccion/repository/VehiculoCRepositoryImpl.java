package com.uce.edu.demo.correccion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

@Repository
public class VehiculoCRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto a la base de datos el vehiculo: " + v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos el vehiculo: " + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base de datos el vehiculo de placa: " + placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el vehiculo de placa: " + placa);
		Vehiculo v = new Vehiculo();
		v.setPlaca(placa);
		v.setMarca("Toyota");
		v.setTipo("P");
		v.setPrecio(new BigDecimal(1200));
		return v;
	}

}
