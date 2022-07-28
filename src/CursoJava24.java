
public class CursoJava24 {
	
	public static void main(String[] args) {
		
		String s0 = new String("Bruno");
		String s1 = new String("bruno");
		String s2 = "Bruno";
		String s3 = "Curso de Java";
		String s4 = "CFB Cursos";
		String s5 = "cfb curso de java";
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("igual.");
		}else {
			System.out.println("diferente.");
		}
		
		if (s1.equals(s2)) {
			System.out.println("igual.");
		}else {
			System.out.println("diferente.");
		}
		
		if(s4.regionMatches(true, 0, s5, 0, 7)) {
			System.out.println("iguais.");
		}else {
			System.out.println("diferentes.");
		}
			
	}

}


/*
s3.compareTo(s1);
compara as strings e retorna 1 se a primeira for maior, 0 se for do mesmo tamanho, e -1 se a segunda for maior.
*/