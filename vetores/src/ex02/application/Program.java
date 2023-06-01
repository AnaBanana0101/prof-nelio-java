package ex02.application;
import java.util.Locale;
import java.util.Scanner;

import ex02.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            System.out.print("Insert the name of the product: ");
            String name = scan.nextLine();
            System.out.print("Enter the price of the product: "); 
            double price = scan.nextDouble(); 
            vect[i] = new Product(name, price); 

        }

        double sum = 0.0; 
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice(); 
        } 
        double avg = sum / vect.length; 

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);
        scan.close();
    }
}
