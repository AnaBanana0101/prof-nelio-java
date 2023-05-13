import java.util.Scanner;

public class EntradaDados {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x;
        double y; 
        char z; 

        x = scan.nextInt();    
        y = scan.nextDouble(); 
        z = scan.next().charAt(0);
        
        System.out.println("Você digitou: " + x);
        System.out.printf("Você digitou: %.2f%n", y);
        System.out.println("Você digitou: " + z);


        scan.close();
    }

}
