import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	    double dividendo, divisor;
		
		for(int x=0 ; x<n ; x++) {
		    dividendo = sc.nextDouble();
		    divisor = sc.nextDouble();
		    if(divisor==0) {
		        System.out.println("divisao impossivel");
		    }
		    else {
		       System.out.printf("%.1f%n", dividendo/divisor); 
		    }
		}
		
		sc.close();
		
	}
}
