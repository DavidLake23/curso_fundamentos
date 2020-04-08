package Taller8;

public class InvertirArreglo {

	// Reto 1

	public static double[] invertirReales(double[] vArreglo) {

		for (int i = 0; i < vArreglo.length / 2; i++) {

			double vTemp = vArreglo[i];
			vArreglo[i] = vArreglo[vArreglo.length - i - 1];
			vArreglo[vArreglo.length - i - 1] = vTemp;
		}

		return vArreglo;
	}

	// Reto 2

	public static String[] invertirString(String[] vArreglo) {

		for (int i = 0; i < vArreglo.length / 2; i++) {
			String vTemp = vArreglo[i];
			vArreglo[i] = vArreglo[vArreglo.length - i - 1];
			vArreglo[vArreglo.length - i - 1] = vTemp;
		}

		return vArreglo;
	}

	// Reto 3

	public static int[] invertirDoble(int[] vArreglo) {

		for (int i = 0; i < vArreglo.length; i++) {

			vArreglo[i] *= 2;
		}

		for (int i = 0; i < vArreglo.length / 2; i++) {

			int vTemp = vArreglo[i];
			vArreglo[i] = vArreglo[vArreglo.length - i - 1];
			vArreglo[vArreglo.length - i - 1] = vTemp;
		}

		return vArreglo;
	}

	// Reto 4

	public static String[] invertirStringMayusculas(String[] vArreglo) {

		for (int i = 0; i < vArreglo.length; i++) {

			vArreglo[i] = vArreglo[i].toUpperCase();
		}

		for (int i = 0; i < vArreglo.length / 2; i++) {
			String vTemp = vArreglo[i];
			vArreglo[i] = vArreglo[vArreglo.length - i - 1];
			vArreglo[vArreglo.length - i - 1] = vTemp;
		}

		return vArreglo;
	}
}
