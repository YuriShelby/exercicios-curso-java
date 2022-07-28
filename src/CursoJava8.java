import java.security.SecureRandom;

public class CursoJava8 {
	
	public static void main(String[] args) {
		
		int [][] numeros = new int [3][5];
		
		for (int l = 0; l < 3; l ++) {
			for (int c = 0; c < 5; c ++) {
				numeros [l][c] = new SecureRandom().nextInt(100);
				System.out.printf("%2d | ", numeros[l][c]);
			}System.out.printf("%n");
		}
		
	}

}
