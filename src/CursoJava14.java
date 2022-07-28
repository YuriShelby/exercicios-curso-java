
public class CursoJava14 {
	
	public static void main (String[] args) {
		
		Carro[] carros = new Carro [5];
		String[] nomesCarros = {"HRV", "Golf", "Camaro", "Mustang", "Toro"};
		
		for (int i = 0; i < 5; i ++) {
			carros[i] = new Carro (nomesCarros[i]);
		}
		
		for (Carro c : carros) {
			c.info();
		}
		
	}

}
