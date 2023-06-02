/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex07_AbaixoMedia {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
 

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numero = scan.nextInt();

        double[] vetor = new double[numero];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double avg = soma / vetor.length;
        System.out.printf("Média do vetor: %.3f\n", avg);

        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < avg) {
                System.out.println(vetor[i]);
            }
        }



        scan.close();
    }
}
