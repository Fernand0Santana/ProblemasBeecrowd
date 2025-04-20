import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int quantAlcool = 0;
        int quantGasolina = 0;
        int quantDiesel = 0;
        
        int opcao = sc.nextInt();
        
        while(opcao != 4) {
            switch(opcao) {
                case 1: {
                    quantAlcool += 1;
                    break;
                }
                case 2: {
                    quantGasolina += 1;
                    break;
                }
                case 3: {
                    quantDiesel += 1;
                }
            }
            opcao = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Diesel: " + quantDiesel);
        
        sc.close();
    }
}
