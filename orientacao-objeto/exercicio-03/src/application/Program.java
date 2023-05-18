package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); 

        Students student = new Students(); 

        System.out.print("Name: ");
        student.name = scan.nextLine(); 
        System.out.println("Enter the grades: ");
        student.grade1 = scan.nextDouble(); 
        student.grade2 = scan.nextDouble(); 
        student.grade3 = scan.nextDouble();

        System.out.printf("Final Grade: %.2f%n", student.finalGrade());
        
        if (student.finalGrade() < 60) {
            System.out.println("Failed!");
            System.out.printf("Missing %.2f points.%n", student.missingPoints());
        }
        else {
            System.out.println("Pass!");
        }

    scan.close();
    }
    
}
