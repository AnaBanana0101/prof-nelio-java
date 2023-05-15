// Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class ExFor_06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        int N = scan.nextInt(); 

        for(int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

    scan.close();
    }

}
