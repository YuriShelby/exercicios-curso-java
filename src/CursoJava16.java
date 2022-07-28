
public class CursoJava16 {
	
	public static void main (String[] args) {
		
		int[] numeros = {10, 5, 15, 20, 100, 25, 14, 8, 3, 98, 75, 62, 0};
		
		for (int i = 0; i < numeros.length; i ++) {
			if (numeros[i] % 2 == 0 && numeros[i] != 0){
				System.out.printf("%d é par.\n", numeros[i]);
			}else if(numeros[i] == 0){
				System.out.printf("%d é neutro.\n", numeros[i]);
			}else {
				System.out.printf("%d é ímpar.\n", numeros[i]);
			}
		}
	}

}
