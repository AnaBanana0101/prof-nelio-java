/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

import java.util.Locale;
import java.util.Scanner;

public class Ex06_SomaVetores {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeros;
        System.out.print("Quantos valores vai ter cada vetor? ");
        numeros = scan.nextInt();
        
        int[] vetorA = new int[numeros];
        int[] vetorB = new int[numeros];
        int[] vetorC = new int[numeros];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }
    
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.printf("%d\n", vetorC[i]);
        }

        scan.close();

    }
}
