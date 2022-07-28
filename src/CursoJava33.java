import java.util.Scanner;

public class CursoJava33 {

	public static void main(String[] args) {
		
		Boolean irNaFesta = false;
		char roupinha;
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("Vou ter roupinha? s/n: ");
		roupinha = teclado.next().charAt(0);
		    if (roupinha == 's' ) {
		    	irNaFesta = true;
		    }
		
		}while (roupinha != 's' && roupinha != 'n');
		
		System.out.printf("Vou na festa? %s", irNaFesta ? "Sim" : "Não");
		
		teclado.close();

	}

}
