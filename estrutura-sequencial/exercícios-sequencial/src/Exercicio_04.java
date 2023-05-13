import java.util.Scanner;

public class Exercicio_04 {
 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroFuncionario; 
        int horasTrabalhadas; 
        double valorHora; 
        double salarioFinal;

        System.out.println("Informe o seu número cadastral: ");
        numeroFuncionario = scan.nextInt();
        System.out.println("Informe o numero de horas mensais trabalhadas: ");
        horasTrabalhadas = scan.nextInt();
        System.out.println("Insira o valor recebido por hora: ");
        valorHora = scan.nextDouble(); 

        salarioFinal = horasTrabalhadas * valorHora; 
        System.out.println("Código do funcionário: " + numeroFuncionario);
        System.out.printf("Salário: $%.2f%n",salarioFinal );

        scan.close();
    }
}