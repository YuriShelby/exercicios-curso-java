import java.util.LinkedList;
import java.util.Queue;

public class CursoJava28 {
	
	public static void main(String[] args) {
		
		Queue<String> carros = new LinkedList<>();
		
		carros.add("HRV");
		carros.add("Golf");
		carros.add("Polo");
		carros.add("Camaro");
		carros.add("Tiggo 3X");

		System.out.println("Mostando e retirando o topo da fila: " + carros.poll());
		System.out.println(carros);
		System.out.println(carros.isEmpty() ? "Sim" : "N�o");
	}

}
