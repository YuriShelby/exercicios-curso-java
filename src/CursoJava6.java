import java.util.Scanner;

public class CursoJava6 {
	
	public static void main(String[] args) {
		
		char [] gabarito = {'a', 'a', 'd', 'b', 'c'};
		char [] respostas = new char [5];
		int  nota = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
		System.out.printf("Informe a %dª resposta: ", i + 1);
		respostas [i]= teclado.next().charAt(0);
		    if (respostas[i] == gabarito[i]) {
		    	nota ++;
		    }       
		}   
		System.out.printf("Nota do aluno: %d", nota);
		
		teclado.close();
	}

}
