package entities;

public class Account {
    
    private int accountNumber; 
    private String accountHolder; 
    private double accountBalance; 
    public double amount; 

    public Account() {
    } 

    public Account(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder; 
    }

    public Account(int accountNumber, String accountHolder, double inicialDeposit) {
        this.accountNumber = accountNumber;  
        this.accountHolder = accountHolder; 
        accountDeposit(inicialDeposit);
    }

    public void setName(String accountHolder) { 
        this.accountHolder = accountHolder; 
    }

    public String getName(){
        return accountHolder;
    }

    public int getNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void accountDeposit(double amount) {
        accountBalance += amount;
    }

    public void accountWithdraw(double amount) {
        accountBalance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $"
                + String.format("%.2f", accountBalance);

    } 


}
