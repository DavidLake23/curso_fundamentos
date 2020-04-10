package Taller8;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GestionadorPersonas {

	private static Persona[] vPersonasFinal = declararPersonas();

	public static Persona[] declararPersonas() {

		Random vRandom = new Random();
		Persona[] vPersonas = new Persona[100];

		for (int i = 0; i < vPersonas.length; i++) {

			vPersonas[i] = new Persona();
		}

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

		int vLow = 45;
		int vHigh = 110;

		for (int i = 0; i < vPersonas.length; i++) {

			vPersonas[i].setPeso(vRandom.nextInt(vHigh - vLow) + vLow);
		}

		// Definición estaturas

		double vLowEstatura = 0.5;
		double vHighEstatura = 1.95;

		for (int i = 0; i < vPersonas.length; i++) {

			vPersonas[i].setEstatura(ThreadLocalRandom.current().nextDouble(vLowEstatura, vHighEstatura));
		}

		// Return statement

		return vPersonas;
	}

	public static void mostrarPersonas() {

		for (int i = 0; i < vPersonasFinal.length; i++) {

			System.out.println("Nombre: " + vPersonasFinal[i].getNombre() + " Peso: " + vPersonasFinal[i].getPeso()
					+ " kg Estatura: " + String.format("%.2f", vPersonasFinal[i].getEstatura()) + "m");
		}
	}

	public static void mostrarPersonas(String vSexo) {

		Persona[] vPersonas = declararPersonas();

		for (int i = 0; i < vPersonas.length; i++) {

			if (vPersonas[i].getSexo().equalsIgnoreCase(vSexo)) {

				System.out.println("Nombre: " + vPersonas[i].getNombre() + " Peso: " + vPersonas[i].getPeso()
						+ " kg Estatura: " + String.format("%.2f", vPersonas[i].getEstatura()) + "m");
			}
		}
	}

	public static Persona getAlta() {

		double vMax = 0;
		Persona vPersona = null;

		for (int i = 0; i < vPersonasFinal.length; i++) {

			if (vPersonasFinal[i].getEstatura() > vMax) {

				vPersona = vPersonasFinal[i];
				vMax = vPersonasFinal[i].getEstatura();
			}
		}

		return vPersona;
	}

	public static Persona getAlta(String vSexo) {

		double vMax = 0;
		Persona vPersona = null;

		for (int i = 0; i < vPersonasFinal.length; i++) {

			if (vPersonasFinal[i].getSexo().equalsIgnoreCase(vSexo)) {

				if (vPersonasFinal[i].getEstatura() > vMax) {

					vPersona = vPersonasFinal[i];
					vMax = vPersonasFinal[i].getEstatura();
				}
			}
		}

		return vPersona;
	}

	public static String getPesada() {

		double vMax = 0;
		Persona vPersona = null;

		for (int i = 0; i < vPersonasFinal.length; i++) {

			if (vPersonasFinal[i].getPeso() > vMax) {

				vPersona = vPersonasFinal[i];
				vMax = vPersonasFinal[i].getPeso();
			}
		}

		return vPersona.getNombre();
	}

	public static double diferenciaPesos() {

		double vMaxHombre = 0;
		double vMaxMujer = 0;

		for (int i = 0; i < vPersonasFinal.length; i++) {

			if (vPersonasFinal[i].getPeso() > vMaxHombre && vPersonasFinal[i].getSexo().equalsIgnoreCase("hombre")) {

				vMaxHombre = vPersonasFinal[i].getPeso();
			}

			if (vPersonasFinal[i].getPeso() > vMaxMujer && vPersonasFinal[i].getSexo().equalsIgnoreCase("mujer")) {

				vMaxMujer = vPersonasFinal[i].getPeso();
			}
		}

		return Math.abs(vMaxHombre - vMaxMujer);
	}

	public static String[] ordenarDescendente() {

		String[] vNombres = new String[vPersonasFinal.length];

		for (int i = 0; i < vPersonasFinal.length; i++) {

			vNombres[i] = vPersonasFinal[i].getNombre();
		}

		Arrays.sort(vNombres);
		vNombres = InvertirArreglo.invertirString(vNombres);

		return vNombres;
	}
	
	public static Persona[] ordenarEstatura() {
		
		Persona[] vPersonas = vPersonasFinal;
		
        for (int i = 0; i < vPersonas.length - 1; i++) {

            int vMin = i;
            
            for (int j = i + 1; j < vPersonas.length; j++) {
            	
                if (vPersonas[j].getEstatura() < vPersonas[vMin].getEstatura()) {
                    
                	vMin = j;
                }
            }

            Persona vTemp = vPersonas[i];
            vPersonas[i] = vPersonas[vMin];
            vPersonas[vMin] = vTemp;;
        }
		
		return vPersonas;
	}
	
	public static double promedioPeso() {
		
		double vPesoTotal = 0;
		
		for(int i = 0; i < vPersonasFinal.length; i++) {
			
			vPesoTotal += vPersonasFinal[i].getPeso();
		}
		
		return vPesoTotal / vPersonasFinal.length;
	}
}