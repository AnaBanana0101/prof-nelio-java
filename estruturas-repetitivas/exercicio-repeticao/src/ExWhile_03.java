import java.util.Scanner;

public class ExWhile_03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int alcool = 0; 
        int gasolina = 0; 
        int diesel = 0;

        System.out.println("Qual combustível deseja abastecer: ");
        int combustivel = scan.nextInt();

        while (combustivel != 4 ) {
            if (combustivel == 1) {
                alcool++; 
            }
            else if (combustivel == 2){
                gasolina++; 
            }
            else if (combustivel == 3) {
                diesel++;
            } 
            
            System.out.println("Qual combustível deseja abastecer: ");
            combustivel = scan.nextInt();
        }

        System.out.println("Muito obrigado pela preferência!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        scan.close();
    }
    
}
