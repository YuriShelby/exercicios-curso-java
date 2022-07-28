
public class CursoJava25 {
	
	public static void main (String[] args) {
		
		String s1 = "CFB Cursos - Curso de Java. ";
		String s2 = "Hoje tem mengão!";
		System.out.println(s1);
		
		if (s1.startsWith("C")) {
			System.out.println("Verdadeiro.");
		}else {
			System.out.println("Falso.");
		}
		
		if (s1.endsWith("ava")) {
			System.out.println("verdadeiro.");
		}else {
			System.out.println("falso.");
		}
		
		System.out.println(s1.substring(4, 21));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s2.replace('H', 'J'));
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		char[] s3 = s2.toCharArray();
		System.out.println(s3);
		
		String[] s4 = s1.split(" ");
		for (String n : s4) {
			System.out.println(n);
		}
		
	}

}
        