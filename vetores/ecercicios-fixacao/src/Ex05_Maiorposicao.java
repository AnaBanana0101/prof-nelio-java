/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex05_Maiorposicao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero, posicaoMaior;
        double maiorNumero; 

        System.out.print("Quantos numeros você vai digitar? ");
        numero = scan.nextInt();

        double[] vetor = new double[numero];

        maiorNumero = 0; 
        posicaoMaior = 0;

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
            if (maiorNumero < vetor[i]){
                maiorNumero = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("Maior valor: %.1f\n", maiorNumero);
        System.out.print("Posição do maior valor: " + posicaoMaior);




        scan.close();
    }
}
