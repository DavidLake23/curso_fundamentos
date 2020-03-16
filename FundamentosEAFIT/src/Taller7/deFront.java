package Taller7;

import java.util.Scanner;

public class deFront {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena: ");
		String vCadena = S.nextLine();
		StringBuilder vBuilder = new StringBuilder(vCadena);
		
		S.close();
		
		if(vCadena.charAt(0) == 'a' && vCadena.charAt(1) == 'b') {
			
			System.out.println("Resultado: "+vCadena);
			return;
		}
		
		if(vCadena.charAt(0) == 'a') {
			
			vCadena = vBuilder.deleteCharAt(1).toString();
			System.out.println("Resultado: "+vCadena);
			return;
		}
		
		if(vCadena.charAt(1) == 'b') {
			
			vCadena = vBuilder.deleteCharAt(0).toString();
			System.out.println("Resultado: "+vCadena);
			return;
		}
		
		System.out.println("Resultado: "+vCadena.substring(2));
	}
}
