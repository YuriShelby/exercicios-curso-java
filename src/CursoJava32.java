
public class CursoJava32 {
	
	public static void main(String[] args) {
		
		int n1 = 5, n2 = 15;
		int min = Math.min(n1, n2);
		int max = Math.max(n1,  n2);
		double raiz = Math.sqrt(64);
		int alea;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(raiz);
		
		for (int i = 0; i < 10; i ++) {
			alea = (int)(Math.random()*101);
			System.out.println(alea);
		}
		
		
	}

}

/*
Math.abs();
os valores negativos são entregues como positivos.
Math.random()*10;
entrega um valor aleatório entre 0 e 10.
*/