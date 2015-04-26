package com.zubiri.parking;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingVehiculos {
	
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	//Constructores
		
		public ParkingVehiculos (ArrayList<Vehiculo> vehiculosIntroducido){
			ParkingVehiculos.vehiculos = vehiculosIntroducido;
		}
	
	//Métodos getter y setter
		
		public static ArrayList<Vehiculo> getVehiculos() {			
			return vehiculos;
		}

		public void setVehiculos (ArrayList<Vehiculo> vehiculosIntroducidos) {			
			ParkingVehiculos.vehiculos = vehiculosIntroducidos;
		}
	
	//Otros métodos
		
		public ParkingVehiculos(Scanner sc) {
			System.out.println("¿Cuántos vehículos quiere añadir?");
			int respuesta = sc.nextInt();
			for (int i = 0; i < respuesta; i++) {
				System.out.println("¿Qué tipo de vehiculo quiere añadir? (Bicicleta/Coche)");
				switch (sc.next()) {
				case "Bicicleta":
					vehiculos.add(new Bicicleta(sc));
					break;
				case "bicicleta":
					vehiculos.add(new Bicicleta(sc));
					break;
				case "Coche":
					vehiculos.add(new Coche(sc));
					break;
				case "coche":
					vehiculos.add(new Coche(sc));
					break;
				}
			}		
		}
		
		public String formatted (ArrayList<Vehiculo> vehiculos){
			String formatted = null;
			
			for (int x = 0; x < vehiculos.size(); x++) {
				
				formatted = vehiculos.get(x).formatted();
			}

			return formatted;	
		}
}