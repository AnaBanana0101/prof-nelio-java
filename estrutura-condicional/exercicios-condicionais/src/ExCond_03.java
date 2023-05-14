import java.util.Scanner;

public class ExCond_03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        int A, B; 

        System.out.println("1º número: ");
        A = scan.nextInt();
        System.out.println("2º número: ");
        B = scan.nextInt();

        if (A % B == 0 || B % A == 0 ) {
            System.out.println("São números multiplos!");
        } else {
            System.out.println("Não são multiplos!");
        }

        scan.close();
    }

}
