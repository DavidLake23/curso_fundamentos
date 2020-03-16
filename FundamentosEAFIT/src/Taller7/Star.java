package Taller7;

public class Star {
	
	public static void main(String[] args) {
		
		String vTexto = "*";
		
		for(int i=0;i<5;i++) {
			
			System.out.println(vTexto);
			vTexto = vTexto.concat(vTexto);
		}
	}
}
