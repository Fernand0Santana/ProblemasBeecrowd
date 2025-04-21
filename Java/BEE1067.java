import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		for(int n=1 ; n<=x ; n+=2) {
		    System.out.println(n);
		}
	}
}
