import java.util.Scanner;

public class ExCond_05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int codigo;
        int quantidade; 

        System.out.println("Escreva o códico do produto desejado:");
        codigo = scan.nextInt();
        System.out.println("Quantidade desejada: ");
        quantidade = scan.nextInt();

        double total; 
        if (codigo == 1) { 
            total = quantidade * 4.0;
        } 
        else if (codigo == 2) {
            total = quantidade * 4.5;
        } 
        else if (codigo == 3) {
            total = quantidade * 5.0;
        } 
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else if (codigo == 5) {
             total = quantidade * 1.5;
        } else {
            System.out.println("Código invalido...");
            total = 0;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        scan.close();
    }

}
