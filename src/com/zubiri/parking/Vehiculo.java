package com.zubiri.parking;

import java.util.Scanner;

public abstract class Vehiculo {

	int numRuedas = 0;
	boolean motor = false;
	String marca = null;

	//Constructores
	
		public Vehiculo (int numRuedasIntroducido, boolean motorIntroducido, String marcaIntroducido) {
			this.numRuedas = numRuedasIntroducido;
			this.motor = motorIntroducido;
			this.marca = marcaIntroducido;		
		}
		
		public Vehiculo (Scanner sc){
			System.out.println("¿Cuál es el número de ruedas del vehiculo? ");
			this.setNumRuedas(sc.nextInt());
			System.out.println("¿Tiene motor el vehiculo (true/false? ");
			this.setMotor(sc.nextBoolean());
			System.out.println("¿Cuál es la marca del vehiculo? ");
			this.setMarca(sc.next());
		}
	
	//Métodos getter y setter
	
		public int getNumRuedas() {
			return numRuedas;
		}
		
		public void setNumRuedas(int numRuedasIntroducido) {
			this.numRuedas = numRuedasIntroducido;
		}
		
		public boolean getMotor() {
			return motor;
		}
		
		public void setMotor(boolean motorIntroducido) {
			this.motor = motorIntroducido;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marcaIntroducido) {
			this.marca = marcaIntroducido;
		}
	
	//Otros métodos
		
		public String formatted() {
			String formatted = null;
			
			formatted = " - Datos del vehiculo: - \n"
			+"\tNúmero de ruedas: " + getNumRuedas() + "\n"
			+"\tTiene motor el vehiculo: " + getMotor() + "\n"
			+"\tMarca del vehiculo: " + getMarca() + "\n";
			
			return formatted;
		}
}