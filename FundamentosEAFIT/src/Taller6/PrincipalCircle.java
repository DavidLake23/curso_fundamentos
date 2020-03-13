package Taller6;

import java.util.Scanner;

public class PrincipalCircle {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int vRadio;
		int vContador = 0;
		
		while(true) {
			
			System.out.print("Ingrese el radio: ");
			vRadio = S.nextInt();
			
			if(vRadio > 0) {
				
				Circle vCirculo = new Circle(vRadio);
				vContador++;
				continue;
			}
			
			System.out.print("Número de Circle: "+vContador);
			S.close();
			break;
		}
	}
}
