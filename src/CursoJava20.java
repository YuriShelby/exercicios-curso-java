import java.util.ArrayList;

public class CursoJava20 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> carros = new ArrayList<>();
		
		numeros.add(11);
		numeros.add(22);
		numeros.add(33);
		carros.add("Vectra");
		carros.add("Gol bolinha");
		carros.add("Porche");
		carros.add("Fiat Uno");
		
		for (int n : numeros) {
			System.out.println(n);
		}
		
		for (String c : carros) {
			System.out.println(c);
		}
		
		for (int i = 0; i < carros.size(); i++) {
			System.out.printf("%s\n",carros.get(i));
		}
		
		/*limpa todo o array
		carros.clear();
		mostra em qual posição do array está.
		System.out.println(carros.indexOf("Porche"));
		remove o elemento especificado do array, podendo informar também pela posição.
		carros.remove("Fiat Uno");
		caso o array tenha mais espaço do que elementos, ele elimina a ocupação da memória, desses espaços vazios.
		carros.trimToSize();
		*/

		
	}

}
