
public class CursoJava12 {
	
	public static void main(String[] args) {
		
		int n1, n2, res;
		String op = "*";
		
		n1 = 10; n2 =5;
		
		switch(op) {
		    case "+":
		    	res = n1 + n2;
		    	break;
		    case "-":
		    	res = n1 - n2;
		    	break;
		    case "*":
		    	res = n1 * n2;
		    	break;
		    case "/":
		    	res = n1 / n2;
		    	break;
		    default:
		    	res = 0;
		    	System.out.printf("%s\n", "Operação inválida.");
		    	break;
		}
		System.out.printf("Operação: %s\nResposta: %d\n", op,res);
		
	}

}
