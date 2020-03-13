package Taller6;

public class PrincipalPlaneta {
	
	public double masaMaligna = 6.2;
	public static int planetasMalignos = 0;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Planeta vPlaneta1 = new Planeta();
		Planeta vPlaneta2 = new Planeta("Marte", 0.63);
		Planeta vPlaneta3 = new Planeta("Venus", 4.867);
		Planeta vPlaneta4 = new Planeta("Jupiter", 1898);
		
		System.out.println("Cantidad de Planetas: "+Planeta.contador);
		System.out.println("Planetas malignos: "+planetasMalignos);
		
		Planeta vPlaneta5 = Planeta.planetaMedio(vPlaneta2);
		System.out.println("Cantidad de Planetas: "+Planeta.contador);
		System.out.println("Planetas malignos: "+planetasMalignos);
	}
}