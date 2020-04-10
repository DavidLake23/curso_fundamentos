package Taller8;

public class Persona {
	
	private String vNombre;
	private String vSexo;
	private double vPeso;
	private double vEstatura;
	
	//Setters
	
	public void setNombre(String vNombre) {
		
		this.vNombre = vNombre;
	}
	
	public void setSexo(String vSexo) {
		
		this.vSexo = vSexo;
	}
	
	public void setPeso(double vPeso) {
		
		this.vPeso = vPeso;
	}
	
	public void setEstatura(double vEstatura) {
		
		this.vEstatura = vEstatura;
	}
	
	//Getters
	
	public String getNombre() {
		
		return this.vNombre;
	}
	
	public String getSexo() {
		
		return this.vSexo;
	}
	
	public double getPeso() {
		
		return this.vPeso;
	}
	
	public double getEstatura() {
		
		return this.vEstatura;
	}
}
