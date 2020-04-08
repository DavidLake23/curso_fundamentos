package Taller8;

import java.util.Scanner;

public class GeneradorNombres {
	
	public static String generarNombre(String vSexo) {
		
		String vResultado = "";
		String[] vNombresHombre = {"Juan David", "Kevin", "Daniel", "David", "Luis", "Andrés", "Miguel", "Antonio", "Raul", "Octavio", "Ramiro", "Juan Miguel", "Jose", "Luis David", "Juan Pablo"};
		String[] vNombresMujer = {"Lorena", "Amelia", "Eva", "Daniela", "Luisa", "Andrea", "Juana", "Celeste", "Catalina", "Carlota", "Diana", "Ana", "Gabriela", "Helena", "Lucía"};
		String[] vApellidos = {"Cardona", "Ocampo", "Nieves", "Barrera", "Buitrago", "Alzate", "Cárdenas", "Terraza", "Londoño", "Cabrera", "Montes", "Hernández", "Ascensio", "Pérez", "Ramirez", "Castillo", "Nuñez", "Orozco", "Gómez", "Santana"};
		
		if(vSexo.equalsIgnoreCase("hombre")) {
			
			vResultado = vResultado.concat(vNombresHombre[(int)(Math.random() * vNombresHombre.length)]);
			vResultado =vResultado.concat(" " + vApellidos[(int)(Math.random() * vApellidos.length)]);
			return vResultado;
		}
		
		else if(vSexo.equalsIgnoreCase("mujer")) {
			
			vResultado = vResultado.concat(vNombresMujer[(int)(Math.random() * vNombresMujer.length)]);
			vResultado = vResultado.concat(" " + vApellidos[(int)(Math.random() * vApellidos.length)]);
			return vResultado;
		}
		
		else {
			
			System.out.println("Parámetro no válido.");
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.print("Ingresa el sexo: ");
		String vSexo = S.next();
		System.out.println(generarNombre(vSexo));
		
		S.close();
	}
}
