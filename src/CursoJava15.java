import java.util.Scanner;

public class CursoJava15 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String nome; 
		char [] respostas = new char [5];
		char [] gabarito = {'a','c','b','a','c'};
		int nota = 0;
		
		
		System.out.print("Digite seu nome: ");
		nome = teclado.next();
		System.out.println("---------------------------");
		System.out.println("Pergunta 1");
		System.out.println("Qual a maior estrela do nosso sistema solar?");
		System.out.println("a) Sol | b) Lua | c) Marte");
		respostas [0] = teclado.next().charAt(0);
		System.out.println("---------------------------");
		System.out.println("Pergunta 2");
		System.out.println("Qual é a primeira letra do nosso alfabeto?");
		System.out.println("a) Z | b) C | c) A");
		respostas [1] = teclado.next().charAt(0);
		System.out.println("---------------------------");
		System.out.println("Pergunta 3");
		System.out.println("2x10 é igual a?");
		System.out.println("a) 10 | b) 20 | c) 12");
		respostas [2] = teclado.next().charAt(0);
		System.out.println("---------------------------");
		System.out.println("Pergunta 4");
		System.out.println("O fantástico mundo de ___? (desenho anos 80)");
		System.out.println("a) Bob | b) Carl | c) Zec");
		respostas [3] = teclado.next().charAt(0);
		System.out.println("---------------------------");
		System.out.println("Pergunta 5");
		System.out.println("Qual é o valor de PI?");
		System.out.println("a) 3.10 | b) 3 | c) 3.14");
		respostas [4] = teclado.next().charAt(0);
		
		for (int i = 0; i < 5; i ++) {
			if (respostas[i] == gabarito[i]) {
				nota = nota + 2;
			}
		}
		
		switch (nota) {
		    case 10: case 8:
			    System.out.printf("%s sua nota foi %d, você foi Aprovado.", nome, nota);
			    break;
		    case 6: case 4:
		    	System.out.printf("%s sua nota foi %d, você ficou de recuperação.", nome, nota);
		    	break;
		    case 2: case 0:
		    	System.out.printf("%s sua nota foi %d, você foi reprovado.", nome, nota);
		    	break;
		}
	    teclado.close();
	}

}
