package Taller7;

import java.util.Scanner;

public class Word {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Ingrese una palabra: ");
		String vPalabra = S.next(); //nextLine() si se desea trabajar con frases
		
		System.out.println("Largo de la palabra: "+vPalabra.length());
		System.out.println("Ubicación de la primera a: "+vPalabra.indexOf("a"));
		System.out.println("Ubicación de la primera A: "+vPalabra.indexOf("A"));
		
		S.close();
	}
}
