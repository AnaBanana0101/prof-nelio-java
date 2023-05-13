import java.util.Scanner;

public class Exercicio_03 {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int A;
        int B; 
        int C;
        int D; 
        int diferenca; 

        System.out.println("Escolha o 1º numero: ");
        A = scan.nextInt();
        System.out.println("Escolha o 2º numero: ");
        B = scan.nextInt();
        System.out.println("Escolha o 3º numero: ");
        C = scan.nextInt();
        System.out.println("Escolha o 4º numero: ");
        D = scan.nextInt();

        diferenca = (A * B) - (C * D);

        System.out.println("A diferença entre os 4 números é: " + diferenca);

        scan.close();
    }

}
