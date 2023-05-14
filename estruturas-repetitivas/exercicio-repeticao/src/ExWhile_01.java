import java.util.Scanner;

public class ExWhile_01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Senha: ");
        int senha = scan.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            System.out.println("Senha: ");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido");

        scan.close();
    }
}
