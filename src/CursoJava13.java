
public class CursoJava13 {
	
	public static void main(String[] args) {
		
		int nota = 8;
		String resultado = "";
		
		switch(nota) {
			case 10: case 9: case 8: case 7:
				resultado = "Aprovado";
				break;
			case 6: case 5: case 4:
				resultado = "Recuperação";
				break;
			case 3: case 2: case 1: case 0:
				resultado = "Reprovado";
				break;
			default:
				resultado = "Nota inválida";
				break;	
		}
		System.out.printf("Resultado: %s", resultado);
		
	}

}
