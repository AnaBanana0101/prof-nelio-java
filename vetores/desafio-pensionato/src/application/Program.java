package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rooms = scan.nextInt();

        for (int i = 1; i <= rooms; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next(); 
            System.out.print("Room: ");
            int roomNumber = scan.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        scan.close();
    }
    
}
