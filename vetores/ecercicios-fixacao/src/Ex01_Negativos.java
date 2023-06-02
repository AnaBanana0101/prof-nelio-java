/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.  */

import java.util.Locale;
import java.util.Scanner;

public class Ex01_Negativos {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); 

        System.out.print("Quantos númers você vai digitar? ");
        int numeros = scan.nextInt(); 
        int[] vect = new int[numeros]; 

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite o número: ");
            vect[i] = scan.nextInt(); 
        }

        System.out.println("Números Negativos: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        scan.close();
    }
}
