package Taller7;

import java.util.Scanner;

public class withoutString {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Ingrese base: ");
		String vBase = S.nextLine();
		System.out.print("Ingrese eliminación: ");
		String vEliminar = S.nextLine();
		
		String vResultado = withoutString1(vBase, vEliminar);
		System.out.println("Resultado: "+vResultado);
		
		S.close();
	}
	
	public static String withoutString1(String a, String b) { //Si pongo "withoutString" lo reconoce como un constructor
		
		return a.replaceAll(b, "");
	}
}
