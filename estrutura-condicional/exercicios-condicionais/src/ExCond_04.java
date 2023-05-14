import java.util.Scanner;

public class ExCond_04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        int horas, inicio, fim;

        System.out.println("Início do jogo: ");
        inicio = scan.nextInt();
        System.out.println("Final do jogo: ");
        fim = scan.nextInt();

        if (inicio < fim) {
            horas = fim - inicio;
        } else { 
            horas = 24 - inicio + fim;
        }

        System.out.println("O jogo durou: " + horas + " horas.");

        scan.close();
    }

}
