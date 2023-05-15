// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class ExFor_05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Número a ser fatorado: ");
        int N = scan.nextInt();
        int fatorial = 1; 

        for (int i = 1; i <= N; i++) {
            fatorial *= i; 
        }

        System.out.println("Fatorial de " + N + " é: " + fatorial + ".");

    scan.close();
    }

}
