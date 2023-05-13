import java.util.Scanner;
import java.util.Locale;

public class Exercicio_05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Outra forma de escrever para poupar linhas
        // int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2; 
        // double valorPeca1, valorPeca2, valorPagar; 

        int codigoPeca1; 
        int numeroPeca1; 
        double valorPeca1; 

        int codigoPeca2; 
        int numeroPeca2;
        double valorPeca2; 

        double valorPagar; 

        System.out.println("Código da 1ª peça:");
        codigoPeca1 = scan.nextInt(); 
        System.out.println("Número de peças:");
        numeroPeca1 = scan.nextInt();
        System.out.println("Valor unitário:");
        valorPeca1 = scan.nextDouble();

        System.out.println("Código da 2ª peça:");
        codigoPeca2 = scan.nextInt(); 
        System.out.println("Número de peças:");
        numeroPeca2 = scan.nextInt();
        System.out.println("Valor unitário:");
        valorPeca2 = scan.nextDouble();

        valorPagar = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: U$%.2f%n", valorPagar);

        scan.close();
    }
}
