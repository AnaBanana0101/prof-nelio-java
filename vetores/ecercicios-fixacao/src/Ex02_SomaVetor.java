/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex02_SomaVetor {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeros;
        double avg, sum;

        System.out.print("QUantos numeros você vai digitar? ");
        numeros = scan.nextInt(); 
        double[] vetor = new double[numeros]; 

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt(); 
        }

        sum = 0; 
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        avg = sum / vetor.length;

        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSoma: %.2f%n", sum);
        System.out.printf("Média: %.2f%n", avg);


        
        scan.close();
    }
}
