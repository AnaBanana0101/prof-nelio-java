import java.util.Scanner;

public class ExCond_06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double valor; 

        System.out.println("Valor: ");
        valor = scan.nextDouble();

        if (valor >= 0 && valor <= 25) { 
            System.out.println("Intervalor entre [0 - 25]");
        } else if (valor >= 25.01 && valor <= 50.0) {
            System.out.println("Intervalor entre [25 - 50]");
        } else if (valor >= 50.01 && valor <= 75.0) { 
            System.out.println("Intervalor entre [50 - 75]");
        } else if ( valor >= 75.01 && valor <= 100.0) {
            System.out.println("Intervalor entre [75 - 100]");
        } else {
            System.out.println("Fora de intervalo.");
        }

        scan.close();        
    }
}
