
public class CursoJava22 {
	
	public static void main (String[] args) {
		
		int nota1 = 50, nota2 = 70, res;
		
		if (nota1 > 50) {
			throw new IllegalArgumentException("Valor de nota inválido.");
		}
		if (nota2 > 50) {
			throw new IllegalArgumentException("Valor de nota inválido.");
		}
		res = nota1 + nota2;
		
		System.out.printf("Resultado: %d", res);
		
		
		
	}

}



//throw cria um erro dentro do programa propositalmente.