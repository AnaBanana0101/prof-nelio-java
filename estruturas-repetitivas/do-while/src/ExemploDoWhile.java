// O laço "do" é utilizado em casos onde pode haver repetição de linhas dentro e fora do while. 

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        char resp; 

        do {

            System.out.println("Digite a temperatura em Celsius: ");
            double C = scan.nextDouble(); 
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.print("Desenha repetir? [s/n]");
            resp = scan.next().charAt(0);
        } while (resp != 'n'); 

    scan.close();
    }
}
