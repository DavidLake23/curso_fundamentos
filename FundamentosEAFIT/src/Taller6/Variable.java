package Taller6;

public class Variable {
	
	public static void mostrar(int arg) {
		
		Object a = arg;
		System.out.println("Parametro recibido tipo: "+a.getClass().getSimpleName());
	}
	
	public static void mostrar(double arg) {
		
		Object a = arg;
		System.out.println("Parametro recibido tipo: "+a.getClass().getSimpleName());
	}
	
	public static void mostrar(boolean arg) {
		
		Object a = arg;
		System.out.println("Parametro recibido tipo: "+a.getClass().getSimpleName());
	}
	
	public static void mostrar(String arg) {
		
		Object a = arg;
		System.out.println("Parametro recibido tipo: "+a.getClass().getSimpleName());
	}
	
	public static void mostrar(char arg) {
		
		Object a = arg;
		System.out.println("Parametro recibido tipo: "+a.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		
		mostrar(1);
		mostrar(1.5);
		mostrar(true);
		mostrar("Hola");
		mostrar('!');
	}
}
