import java.util.Scanner;

public class ExCond_01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero; 

        System.out.println("Digite um número:");
        numero = scan.nextInt();
        
        if (numero > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número é negativo!");
        }

        scan.close();
    }

}
