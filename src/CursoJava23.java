
public class CursoJava23 {
	
	public static void main (String[] args) {
	
    char[] texto_c = {'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
    String texto_s = new String ("CFB Cursos");
    char[] receba = new char[10];
    
    String s1 = new String();
    String s2 = new String (texto_s);
    String s3 = new String (texto_c);
    String s4 = new String (texto_c,0,5);
    
    
    
    System.out.printf("Tamanho do texto: %d\n", texto_s.length());
    System.out.printf("Letra  da posição expecifica: %s\n", texto_s.charAt(4));
    texto_s.getChars(4, 10, receba, 0);
    System.out.println(receba);
 
	} 

}
