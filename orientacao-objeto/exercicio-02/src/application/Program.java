/*
 Fazer um programa para ler os dados de um funcionario. Em seguida mostrar os dados do funcinário. 
 Em seguida, aumetar o salário do funcioário com base em uma porcentagem dada e mostra os dados do funcionário. 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee emp = new Employee(); 

        System.out.print("Name: ");
        emp.name = scan.nextLine(); 
        System.out.print("Gross Salary: ");
        emp.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        emp.tax = scan.nextDouble(); 

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which Percentage to increse salary? ");
        double percentage = scan.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

    scan.close();
    }
}
