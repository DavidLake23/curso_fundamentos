package Taller8;

public class SubArreglos {

	// Reto 1

	public static int[] subarreglo(int[] vArreglo) {

		int vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {

			if (vArreglo[i] > vArreglo[0]) {

				vContador++;
			}
		}

		int[] vArregloFinal = new int[vContador];
		vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {
			
			if(vArreglo[i] > vArreglo[0]) {
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
			}
		}
		
		return vArregloFinal;
	}

	// Reto 2

	public static double[] subarreglo(double[] vArreglo) {

		int vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {

			if (vArreglo[i] > vArreglo[vArreglo.length - 1]) {

				vContador++;
			}
		}

		double[] vArregloFinal = new double[vContador];
		vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {
			
			if(vArreglo[i] > vArreglo[vArreglo.length - 1]) {
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
			}
		}
		
		return vArregloFinal;
	}
	
	//Reto 3
	
	public static String[] subarreglo(String[] vArreglo) {

		int vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {
			
			switch(vArreglo[i].charAt(0)){
			
			case 'a':
				
				vContador++;
				break;
			case 'A':
				
				vContador++;
				break;
			case 'e':
				
				vContador++;
				break;
			case 'E':
				
				vContador++;
				break;
			case 'i':
				
				vContador++;
				break;
			case 'I':
				
				vContador++;
				break;
			case 'o':
				
				vContador++;
				break;
			case 'O':
				
				vContador++;
				break;
			case 'u':
				
				vContador++;
				break;
			case 'U':
				
				vContador++;
				break;
			}
		}

		String[] vArregloFinal = new String[vContador];
		vContador = 0;

		for (int i = 0; i < vArreglo.length; i++) {
			
			switch(vArreglo[i].charAt(0)) {
			
			case 'a':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'A':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'e':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'E':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'i':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'I':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'o':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'O':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'u':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			case 'U':
				
				vArregloFinal[vContador] = vArreglo[i];
				vContador++;
				break;
			}
		}
		
		return vArregloFinal;
	}
}
