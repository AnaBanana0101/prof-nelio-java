// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
// peso 5.

import java.util.Locale;
import java.util.Scanner;

public class ExFor_03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de casos de teste a se realizar: ");
        int N = scan.nextInt();

        for (double i = 0; i < N; i++) {
            System.out.println("Insira o valor a ser testado: ");
            double a = scan.nextDouble(); 
            double b = scan.nextDouble(); 
            double c = scan.nextDouble(); 

            double media = (a*2.0 + b*3.0 + c*5.0) / 10;

            System.out.printf("Média: %.1f%n", media);

        }

        scan.close();
    }
    
}
