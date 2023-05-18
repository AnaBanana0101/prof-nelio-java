package utilities;

public class CurrencyConverter {

    public static final double IOF = 0.06; 

    public static double dollarToReal(double price, double amount) {
        amount += amount * IOF; 
        return price * amount; 
    }


}
