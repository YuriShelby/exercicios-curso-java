
public class CursoJava2 {
	
	public static void main(String[] args) {
		
		int nota = 100;
		int media = 60;
		int faltas = 10;
		int maxfaltas = 5;
		
		if (nota >= media && faltas <= maxfaltas) {
			System.out.println("Aprovado!");
		}else if (nota >= 40) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}
		System.out.println("Fim do programa.");
	}

}
