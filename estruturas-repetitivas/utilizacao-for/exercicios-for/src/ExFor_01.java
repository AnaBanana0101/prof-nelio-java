// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
// X, se for o caso.

import java.util.Scanner;

public class ExFor_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        System.out.println("Escolha um número");
        int x = scan.nextInt(); 

        for (int i =1; i<=x; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
