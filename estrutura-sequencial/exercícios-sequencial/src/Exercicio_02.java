import java.util.Scanner;

public class Exercicio_02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double raio; 
        double pi = 3.14159; 
        double area; 
       
        System.out.println("Insira o raio do círculo a ser calculado: ");
        raio = scan.nextDouble();

        area = pi * (Math.pow(raio, 2.0));

        System.out.printf("A área do círculo é %.4f%n", area);


        scan.close();
    }

}
