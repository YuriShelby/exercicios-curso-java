
public class CursoJava17 {
	
	public static void main (String[] args) {
		
		int[] notas = {10, 85, 62, 45, 98, 78, 88, 60, 67, 82};
		int[] resultado = {0,0};
		
		conferirNotas(notas, resultado);
		System.out.printf("Aprovados: %d\n", resultado[0]);
		System.out.printf("Reprovados: %d\n", resultado[1]);
		
	}
	
	public static void conferirNotas(int[] nt, int[] r) {
		for (int i = 0; i < nt.length; i++) {
			if (nt[i] >= 60) {
				r[0]++;
			}else {
				r[1]++;
			}
		}
	}

}
