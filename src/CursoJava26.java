import java.nio.file.*;

public class CursoJava26 {
	
	public static void main(String[] args) {
		
		Path diretorio = Paths.get("C:/Users/Yuri/eclipse-workspace/ProgramasJava/src/br");
		Path arquivo = Paths.get("C:/Users/Yuri/eclipse-workspace/ProgramasJava/src/br/Exercicio12.java");
		
		if(Files.isDirectory(diretorio)) {
			System.out.println("Diret�rio existe");
		}else {
			System.out.println("Diret�rio N�O existe");
		}
		
		if(Files.exists(arquivo)) {
			System.out.println("Arquivo existe.");
		}else {
			System.out.println("Arquivo N�O existe.");
		}
	}

}
