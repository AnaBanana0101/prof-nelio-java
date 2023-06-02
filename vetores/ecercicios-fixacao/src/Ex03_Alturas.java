/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex03_Alturas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); 

        int numero, nMenores; 
        double alturaMedia, nPercentual, alturaSoma;
        System.out.print("Quantas pessoas serão cadastradas: ");
        numero = scan.nextInt();

        String[] nome = new String[numero];
        int[] idade = new int[numero];
        double[] altura = new double[numero];
        
        for (int i = 0; i < numero; i++) {
            System.out.printf("Dados %sª pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome[i] = scan.next();

            System.out.print("Idade: ");
            idade[i] = scan.nextInt();

            System.out.print("Altura: ");
            altura[i] = scan.nextDouble();
        }

        nMenores = 0;
        alturaSoma = 0;
        for (int i = 0; i < numero; i++) {
            if (idade[i] < 16){
                nMenores++;
            }
            alturaSoma += altura[i];
        }

        alturaMedia = alturaSoma / numero; 
        nPercentual = ((double) nMenores/ numero) * 100;

        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", nPercentual);

        for (int i = 0; i < numero; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        scan.close();
    }
}
