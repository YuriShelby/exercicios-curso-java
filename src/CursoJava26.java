import java.nio.file.*;

public class CursoJava26 {
	
	public static void main(String[] args) {
		
		Path diretorio = Paths.get("C:/Users/Yuri/eclipse-workspace/ProgramasJava/src/br");
		Path arquivo = Paths.get("C:/Users/Yuri/eclipse-workspace/ProgramasJava/src/br/Exercicio12.java");
		
		if(Files.isDirectory(diretorio)) {
			System.out.println("Diretório existe");
		}else {
			System.out.println("Diretório NÃO existe");
		}
		
		if(Files.exists(arquivo)) {
			System.out.println("Arquivo existe.");
		}else {
			System.out.println("Arquivo NÃO existe.");
		}
	}

}
