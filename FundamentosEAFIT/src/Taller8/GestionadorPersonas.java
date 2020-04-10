package Taller8;

import java.util.Random;

public class GestionadorPersonas {

	public static Persona[] declararPersonas() {

		Persona[] vPersonas = new Persona[10];

		// Definición de sexos

		for (int i = 0; i < vPersonas.length / 2; i++) {

			vPersonas[i].setSexo("hombre");
		}

		for (int i = vPersonas.length / 2; i < vPersonas.length; i++) {

			vPersonas[i].setSexo("mujer");
		}

		// Definición nombres

		for (int i = 0; i < vPersonas.length; i++) {
			
			vPersonas[i].setNombre(GeneradorNombres.generarNombre(vPersonas[i].getSexo()));
		}
		
		// Definición pesos
		
		Random vRandom = new Random();
		int vLow = 45;
		int vHigh = 110;
		
		for(int i = 0; i < vPersonas.length; i++) {
			
			vPersonas[i].setPeso(vRandom.nextInt(vHigh-vLow) + vLow);
		}
		
		//Definición estaturas
		
		double vLowEstatura = 0.5;
		double vHighEstatura = 1.95;
		
		for(int i = 0; i < vPersonas.length; i++) {
			
			vPersonas[i].setEstatura(vRandom.nextInt((int)(vHighEstatura - vLowEstatura)) - vLowEstatura);
		}
		
		//Return statement
		
		return vPersonas;
	}
	
	public static void main(String[] args) {
		
		Persona[] personas = declararPersonas();
		
		for(int i = 0; i < personas.length; i++) {
			
			System.out.println(personas[i].getNombre() + " " + personas[i].getSexo() + " " + personas[i].getPeso() + " " + personas[i].getEstatura());
		}
	}
}