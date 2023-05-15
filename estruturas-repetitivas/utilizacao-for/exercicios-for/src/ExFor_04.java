// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Locale;
import java.util.Scanner;

public class ExFor_04 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de opeações a ser realizadas: ");
        int N = scan.nextInt();
        double divisao = 0; 

        for (int i = 0; i < N; i++) {    
            System.out.println("Insira os valores a serem divididos: ");
            double a = scan.nextDouble(); 
            double b = scan.nextDouble(); 

                if (b == 0) {
                    System.out.println("Divisão impossível");
                }
                else {
                    divisao = a / b; 
                    System.out.printf("Resultado: %.1f%n", divisao);
                }
            }

        scan.close();
    }

}
