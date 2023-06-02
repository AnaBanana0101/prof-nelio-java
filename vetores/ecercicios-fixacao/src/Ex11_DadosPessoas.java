/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

import java.util.Locale;
import java.util.Scanner;

public class Ex11_DadosPessoas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); 

        System.out.print("Quantas pessoas seram digitadas: ");
        int pessoas = scan.nextInt(); 

        double alturaTotal = 0, mediaAlturaF = 0; 
        int numeroM = 0, numeroF = 0;

        double maiorAltura, menorAltura;


        char[] genero = new char[pessoas];
        double[] altura = new double[pessoas];

        for(int i = 0; i < pessoas; i++) {
            System.out.printf("Altura da %s pessoa: ", i + 1);
            altura[i] = scan.nextDouble(); 

            System.out.printf("Gênero da %s pessoa: ", i + 1);
            genero[i] = scan.next().charAt(0);

            if(genero[i] == 'm') {
                numeroM++;
            } else if (genero[i] == 'f'){
                alturaTotal += altura[i];
                numeroF++;
            }
        }

        maiorAltura = altura[0]; 
        menorAltura = altura[0];
        for(int i = 0; i < pessoas; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            } else if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        mediaAlturaF = alturaTotal / numeroF;  

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres: %.2f\n", mediaAlturaF);
        System.out.println("Número de homens: " + numeroM);
        

        scan.close();
    }
}
