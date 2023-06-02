/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex08_MediaPares {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Quantos elementos vai ter o vetor? ");
        int numeros = scan.nextInt(); 


        int[] vetor = new int[numeros];

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }


        int numeroPares = 0;
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                numeroPares++;
            }
        }


        if (numeroPares == 0) {
            System.out.println("Nenhum numero par!");
        } else {
            double avg = soma / numeroPares;
            System.out.printf("Média dos pares = %.1f\n", avg);
        }


        scan.close();
    }
}
