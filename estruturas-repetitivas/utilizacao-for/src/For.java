import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        System.out.println("Escolha a quantidade de número: ");
        int N = scan.nextInt();
        int soma = 0;

//for ( início; condição; incremento)
//o início executa somente na primeira vez
//a condição verifica se é verdadeiro ou falso, quando é verdadeiro é executada e volta para realizar de novo o laço for e quando falsa, interrompe a execução e pula para fora do laço
//o incremento executa toda vez depois em que a condição for verdadeira
 
        for (int i = 0; i < N; i++) {
            System.out.println("Escolha um número: ");
            int x = scan.nextInt();
            soma += x; 
        }
    
        System.out.println("Soma: " + soma);
        
        scan.close();

    }
}
