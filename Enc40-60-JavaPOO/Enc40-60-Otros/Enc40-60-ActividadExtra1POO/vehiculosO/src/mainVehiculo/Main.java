package mainVehiculo;

import java.util.Scanner;

import Entidad.Vehiculo;
import Servicios.VehiculoServicios;

public class Main {

	public static void main(String[] args) {
		
		VehiculoServicios vs = new VehiculoServicios();
		
		Vehiculo v1 = vs.crearVehiculo();
		Vehiculo v2 = vs.crearVehiculo();
		Vehiculo v3 = vs.crearVehiculo();
		
		
		System.out.println( "Los metros recorridos son: " + vs.moverse(v1) + vs.frenar(v1));
		System.out.println( "Los metros recorridos son: " + vs.moverse(v2) + vs.frenar(v2));
		System.out.println( "Los metros recorridos son: " + vs.moverse(v3) + vs.frenar(v3));
		

	}

}
