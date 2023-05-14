import java.util.Scanner;

public class ExWhile_02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira coordenada: ");
        int x = scan.nextInt();

        System.out.println("Segunda coordenada: ");
        int y = scan.nextInt(); 

        while (x != 0 && y != 0){

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Segundo quadrante");
            } 
            else {
                System.out.println("Terceiro quadrante");
            }

            System.out.println("Primeira coordenada: ");
            x = scan.nextInt();
    
            System.out.println("Segunda coordenada: ");
            y = scan.nextInt(); 

        }      

    scan.close();
    }
}
