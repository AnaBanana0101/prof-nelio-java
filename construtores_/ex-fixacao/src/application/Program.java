package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in); 
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt(); 
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String accountHoler = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        if(response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double inicialDeposit = scan.nextDouble();
            account = new Account(accountNumber, accountHoler, inicialDeposit);
        } else {
            account = new Account(accountNumber, accountHoler);
        }

        System.out.println();
        System.out.println("Account data: "); 
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble(); 
        account.accountDeposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double withdrawtValue = scan.nextDouble(); 
        account.accountWithdraw(withdrawtValue);   

        System.out.println("Updated account data: ");
        System.out.println(account);
    
        scan.close();
    }
}
