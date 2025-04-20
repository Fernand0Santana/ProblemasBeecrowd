import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        
        sc.close();
      
        if(salario <= 2000) {
            System.out.println("Isento");
        }
        else if(salario <= 3000) {
            System.out.printf("R$ %.2f%n", (salario - 2000) * 0.08);
        }
        else if(salario <= 4500) {
            System.out.printf("R$ %.2f%n", (salario - 3000) * 0.18 + 80);
        }
        else {
            System.out.printf("R$ %.2f%n", (salario - 4500) * 0.28 + 350);
        }
        
    }
}
