import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A, B, C;
        double triangulo, circulo, trapezio, quadrado, retangulo; 

        System.out.println("Valor de A:");
        A = scan.nextDouble(); 
        System.out.println("Valor de B:");
        B = scan.nextDouble(); 
        System.out.println("Valor de C:");
        C = scan.nextDouble(); 

        triangulo = (A * C) / 2; 
        circulo = 3.14159 * (Math.pow(C, 2.0)); 
        trapezio = (A + B) * C / 2; 
        quadrado = Math.pow(B, 2.0); 
        retangulo = A * B; 

        System.out.printf("ÁREA TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("ÁREA CÍCULO: %.3f%n", circulo);
        System.out.printf("ÁREA TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("ÁREA QUADRADO: %.3f%n", quadrado);
        System.out.printf("ÁREA RETANGULO: %.3f%n", retangulo);

        scan.close();
        }
    }
