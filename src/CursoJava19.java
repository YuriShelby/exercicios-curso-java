import java.util.Scanner;

public class CursoJava19 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[][] numeros = new int[3][5];
		
		for (int l = 0; l < 3; l ++) {
		    for(int c= 0; c < 5; c ++) {
		    	System.out.printf("Informe o %dº valor: \n", c + 1);
				numeros[l][c] = teclado.nextInt();
		    }
		}    
		    
		    
		for (int l = 0; l < 3; l ++) {
		    for (int c = 0; c < 5; c ++) {
		        System.out.printf("%d | ", numeros[l][c]);
		    	}
		    System.out.printf("%n");
		    }
		    
		    
		teclado.close();
		
	}

}
