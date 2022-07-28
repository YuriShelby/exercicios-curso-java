import java.util.ArrayList;

public class CursoJava21 {
	
	public static void main (String[] args) {
		
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("HRV");
		carros.add("Polo");
		carros.add("Cruze");
		carros.add("Argo");
		carros.add("Fusion");
		
		try {
			System.out.println(carros.get(10));
		}catch(Exception e) {
			System.out.println("Erro. " + e.getMessage());
		}finally {
			System.out.println("Fim do teste de erro.");
		}
		
		
	}

}


//tudo que estiver dentro do try, se der erro, aparece uma mensagem ao inves de parar o programa,
//e tudo que estiver depois do finally, é executado mesmo dando erro dentro do try.