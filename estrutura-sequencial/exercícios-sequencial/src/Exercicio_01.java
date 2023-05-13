import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
        int x;
        int y; 
       

        System.out.println("1º número: ");
        x = scan.nextInt();

        System.out.println("2º número: ");
        y = scan.nextInt(); 

        System.out.print("Soma = " + (x + y));

        
        scan.close();
        ;
    }
}
