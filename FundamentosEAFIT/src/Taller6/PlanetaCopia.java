package Taller6;

public class PlanetaCopia {
	
	private String nombre;
	private double masa;
	public static int contador = 0;
	
	@SuppressWarnings("unused")
	public PlanetaCopia() {
		
		PlanetaCopia vPlaneta = new PlanetaCopia("Tierra",5972);
	}
	
	public PlanetaCopia(String n, double m) {
		
		this.nombre = n;
		this.masa = m;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public double getMasa() {
		
		return this.masa;
	}
	
	public void setNombre(String n) {
		
		this.nombre = n;
	}
	
	public void setMasa(double m) {
		
		this.masa = m;
	}
	
	public static PlanetaCopia planetaMedio(PlanetaCopia p) {
		
		PlanetaCopia vPlaneta = new PlanetaCopia(p.getNombre(), p.getMasa() / 2);
		return vPlaneta;
	}
}
