package ex01;
import java.util.Locale;
import java.util.Scanner;

public class Ex01Vetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        Locale.setDefault(Locale.US);
        
        System.out.println("Insira o numero de pessoas: ");
        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite as alturas: ");
            vect[i] = scan.nextDouble();
        }

        double sum = 0.0; 
            for (int i=0; i < n; i++){
                sum += vect[i];
        }
        
        double avg = sum / n; 

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        scan.close();
    }
}
