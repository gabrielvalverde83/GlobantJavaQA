package Servicios;

import java.util.Scanner;

import Entidad.Vehiculo;

public class VehiculoServicios {
	
	Scanner leer = new Scanner(System.in);
	
	public Vehiculo crearVehiculo() {
		
		
		
		String tipo;
		
		do {
		System.out.println("Ingresa el tipo del vehiculo opciones: carro, moto, bicicleta");
		tipo = leer.nextLine();}
		while(!tipo.equals("carro")  && !tipo.equals("moto")  && !tipo.equals("bicicleta"));
		
		System.out.println("Ingresa la marca del vehiculo");
		String marca = leer.nextLine();
		
		System.out.println("Ingresa el modelo del vehiculo");
		String modelo = leer.nextLine();
		
		System.out.println("Ingresa el anio del vehiculo");
		int anio = leer.nextInt();
		
		return new Vehiculo(tipo, marca, modelo, anio);
		
	}
	
	public int moverse( Vehiculo v1) {
		
		System.out.println("Ingresa el tiempo en segundos");
		int tiempoSegundos = leer.nextInt();
		
		int distancia = 0;
		switch (v1.getTipo()) {
		case "carro":
			distancia = 3*tiempoSegundos;
			break;
		case "moto":
			distancia = 2*tiempoSegundos;
			break;
		case "bicicleta":
			distancia = 1*tiempoSegundos ;
			break;
		default:
			break;
		}
		
		return distancia;
	}
	
	public int frenar(Vehiculo v1) {
		
		int frenado = 0;
		
		if(v1.getTipo() != "bicicleta") {
			frenado =2;
		}
		
		return frenado;
	}
}





