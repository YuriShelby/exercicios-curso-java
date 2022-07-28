import java.util.Scanner;

public class CursoJava5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, n4, soma;
		String nome, res;
		final int media = 60;
		
		System.out.println("Digite o seu nome: ");
		nome = teclado.next();
		
		System.out.println("Digite a primeira nota: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = teclado.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3 = teclado.nextInt();
		
		System.out.println("Digite a quarta nota");
		n4 = teclado.nextInt();
		
		soma = n1 +n2 + n3 + n4;
		
		if(soma >= media) {
			res = "aprovado";
		}else if (soma >= 40) {
			res = "recuperação";
		}else {
			res = "reprovado";
		}
		
		System.out.printf("Aluno %s, ficou %s, com nota %d.",nome, res, soma);
		
		teclado.close();
	}

}
