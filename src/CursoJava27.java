import java.util.Stack;

public class CursoJava27 {
	
	public static void main(String[] args) {
		
		Stack<String> carros = new Stack<>();
		
		carros.push("HRV");
		carros.push("Golf");
		carros.push("Polo");
		carros.push("Camaro");
		carros.push("Tiggo 3X");
		
		System.out.println(carros);
		
		for (String c : carros) {
			System.out.println(c);
		}
		System.out.println(carros.peek());
	}
	
}


/*
carros.peek();
informa o elemento do topo da pilha
carros.pop();
informa e retira o elemento do topo da pilha
carros.clear();
limpa toda a pilha
carros.empty();
informa se a pilha está vazia com elementos. (boolean)
*/