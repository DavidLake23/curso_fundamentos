package Taller7;

import java.util.Scanner;

public class Substring {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.print("Ingrese primera cadena: ");
		String vCadena1 = S.next();
		System.out.print("Ingrese segunda cadena: ");
		String vCadena2 = S.next();
		
		if(vCadena2.endsWith(new StringBuilder(vCadena1.substring(0, 2)).reverse().toString())) {
			
			System.out.print("Coinciden");
		}
		
		else {
			
			System.out.print("No coinciden");
		}
		
		S.close();
	}
}
