/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

import java.util.Locale;
import java.util.Scanner;

public class Ex09_MaisVelho {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int numeroPessoas = scan.nextInt(); 

        String[] nome = new String[numeroPessoas];
        int[] idade = new int[numeroPessoas]; 

        int maisVelho = idade[0];
        int posicaoVelho = 0;


        for (int i = 0; i < numeroPessoas; i++) {
            System.out.printf("Dados da %sª pessoa:\n", i + 1);
                System.out.print("Nome: ");
                nome[i] = scan.next();

                System.out.print("Idade: ");
                idade[i] = scan.nextInt();

                    if (idade[i] > maisVelho) {
                        maisVelho = idade[i];
                        posicaoVelho = i; 
            }
        }

        System.out.println("Pessoa mais velha: " + nome[posicaoVelho]);

        scan.close();
    } 
}
