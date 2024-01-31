import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int e = 1 ; e <= N ; e++) {
			System.out.printf("%d %d %d%n", e, e*e, e*e*e  );
		}
		sc.close();
	}
}
