/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex04_NumerosPares {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); 

        int numero, somaNumero;
        System.out.print("Quantos numeros você vai digitar: ");
        numero = scan.nextInt();
        int[] vetor = new int[numero]; 

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt(); 
        }

        somaNumero = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < numero; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ",vetor[i]);
                somaNumero++; 
            }
        }
        System.out.println("\nQuantidade de pares: " + somaNumero);

        scan.close();
    }
}
