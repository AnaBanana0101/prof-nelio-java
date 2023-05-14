import java.util.Scanner;

public class ExCond_08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double salario, imposto; 

        System.out.println("Insira o valor do seu salário:");
        salario = scan.nextDouble();


        if (salario <= 2000.00) {
            imposto = 0; 
        }
        else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        }
        else if (salario <= 4500.00){
            imposto = (salario - 3000.00) * 0.18 - (1000 * 0.08);
        }
        else {
            imposto = (salario - 4500.00) * 0.28 - (1500 * 0.18) - (1000 * 0.08);
        }

        if (imposto == 0) {
            System.out.println("Insento");
        } else { 
            System.out.printf("R$%.2f%n", imposto);
        }

        
        scan.close();
    }

}
