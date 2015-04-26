
package com.zubiri.parking;

import java.util.Scanner;

public final class Bicicleta extends Vehiculo {

	int numPiñones = 0;
	String tipo = null;
	
	//Constructores
	
		public Bicicleta (int numRuedasIntroducido, boolean motorIntroducido, String marcaIntroducido, int numPiñonesIntroducido, String tipoIntroducido) {
			super(numRuedasIntroducido, motorIntroducido, marcaIntroducido);
			this.numPiñones = numPiñonesIntroducido;
			this.tipo = tipoIntroducido;
		}
		
		public Bicicleta (Scanner sc){
			super(sc);
			System.out.println("¿Número de piñones de la bicicleta? ");
			this.setNumPiñones(sc.nextInt());
			System.out.println("¿De que tipo es la bicicleta? ");
			this.setTipo(sc.next());
		}
	
	//Métodos getter y setter
	
		public int getNumPiñones() {
			return numPiñones;
		}
		
		public void setNumPiñones (int numPiñonesIntroducido) {
			this.numPiñones = numPiñonesIntroducido;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public void setTipo (String tipoIntroducido) {
			this.tipo = tipoIntroducido;
		}
	
	//Otros métodos
	
		public String formatted() {
			String formatted = null;
			
			formatted = super.formatted() + " - Datos de la bicicleta - \n"
			+"\tNúmero de piñones: " + getNumPiñones() + "\n"
			+"\tTipo de bicicleta: " + getTipo() + "\n";
			
			return formatted;
		}
}