// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class ExFor_02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        System.out.println("Escolha a quantidade de números: ");
        int N = scan.nextInt(); 
        int countOut = 0;
        int countIn = 0;

        for(int i = 0; i < N; i++) {
            
            System.out.println("Escolha um numero");
            int x = scan.nextInt(); 
           
            if (x >= 10 && x <= 20) {
                countIn++;
            }
            else {
                countOut++; 
            }
        }

        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
        
        scan.close();
    }

}
