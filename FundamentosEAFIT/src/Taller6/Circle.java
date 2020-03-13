package Taller6;

public class Circle {
	
	 private double vRadio;
	 
	 public static int vNumeroObjetos = 0;
	 public Circle() {
		 
		 vRadio = 1;
		 vNumeroObjetos++;
	 }
	 public Circle(double newRadius) {
		 
		 vRadio = newRadius;
		 vNumeroObjetos++;
	 }
	 public static int getNumberOfObjects() {
	 return vNumeroObjetos;
	 }

}
