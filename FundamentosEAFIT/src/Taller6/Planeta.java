package Taller6;

public class Planeta {
	
	private String nombre;
	private double masa;
	public int contador;
	
	@SuppressWarnings("unused")
	public Planeta() {
		
		Planeta vPlaneta = new Planeta("Tierra",5972);
	}
	
	public Planeta(String n, double m) {
		
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
	
	public Planeta planetaMedio(Planeta p) {
		
		Planeta vPlaneta = new Planeta(p.getNombre(), p.getMasa() / 2);
		return vPlaneta;
	}
}
