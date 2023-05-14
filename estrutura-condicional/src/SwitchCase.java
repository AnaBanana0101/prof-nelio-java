import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int escolha;
        String dia; 

        System.out.println("Qual o dia da semana? ");
        escolha = scan.nextInt();

//estrutura de decisão usada quando precisa-se testar condições para determinar qual função será executada em seguida.
//Sempre deve ter um break no final do case
        switch (escolha) {
            case 1: 
                dia = "domingo"; 
                break;
            case 2: 
                dia = "segunda";
                break; 
            case 3: 
                dia = "terça"; 
                break;
            case 4: 
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta"; 
                break; 
            case 7: 
                dia = "sabado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        scan.close();
    }

}
