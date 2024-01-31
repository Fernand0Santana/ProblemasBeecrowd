import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		sc.close();
		
		for(int cont = 0 ; cont < 6; X++) {
		    if (X % 2 == 1) {
		        System.out.println(X);
                cont++;
		    }
		}
	}
}
