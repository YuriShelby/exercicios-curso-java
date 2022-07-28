
public class CursoJava18 {
	
	public static void main (String[] args) {
		
		int[] valores = {10, 5, 2, 3, 1, 9, 4};
		int resultado = soma(valores);
	    System.out.printf("%d", resultado);
		
		
	}
	
	public static int soma(int[] n) {	
		int resultado = 0;
		for(int i = 0; i < n.length; i++) {
			resultado += n[i];
		}
		return resultado;
		
	}
	
	
	

}
