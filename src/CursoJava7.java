import java.util.Arrays;

public class CursoJava7 {
	
	public static void main(String[] args) {
		
		int[] num = {10, 20, 80, 40, 34};
		
		Arrays.sort(num);
		
		for (int n : num) {
			System.out.printf("%d - ", n);
		}
		
	}

}
