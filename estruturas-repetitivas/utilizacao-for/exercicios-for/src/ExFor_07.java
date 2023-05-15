// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor


import java.util.Scanner;

public class ExFor_07 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de linhas: ");
        int N = scan.nextInt(); 

        for (int i = 1; i <= N; i++) {

            int num1 = i;
            int num2 = i*i;
            int num3 = i*i*i;

            System.out.printf("%d %d %d%n", num1, num2, num3);
        }


    scan.close();
    }

}
