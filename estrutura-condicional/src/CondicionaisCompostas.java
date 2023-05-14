import java.util.Scanner;

public class CondicionaisCompostas {
    
//Se execução for verdadeira executa somente o bloco if. 
//Se execução for falsa executa somente o bloco else. 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int horas; 

        System.out.println("Quantas horas?");
        horas = scan.nextInt(); 

        if (horas < 12) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Boa tarde!");
        }
        
        scan.close();
    }
}

