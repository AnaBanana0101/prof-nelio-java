package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = scan.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double amount = scan.nextDouble();

        System.out.printf("Amount to be paid in reais: R$%.2f%n", CurrencyConverter.dollarToReal(price, amount));
    
    scan.close();
    }
}
