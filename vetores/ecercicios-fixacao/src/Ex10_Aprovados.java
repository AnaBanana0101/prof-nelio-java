/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

import java.util.Locale;
import java.util.Scanner;

public class Ex10_Aprovados {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos seram digitados: ");
        int alunos = scan.nextInt(); 


        String[] nome = new String[alunos];
        double[] nota1 = new double[alunos]; 
        double[] nota2 = new double[alunos];

        double avg = 0;

        for (int i = 0; i < alunos; i++) {
            System.out.printf("Digite o nome do %s aluno: ", i + 1);
            scan.nextLine();
            nome[i] = scan.nextLine(); 
                System.out.print("Nota do 1º semestre: ");
                nota1[i] = scan.nextDouble(); 
                System.out.print("Nota do 2º semestre: ");
                nota2[i] = scan.nextDouble(); 
        }
           
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos; i++) {
            avg = (nota1[i] + nota2[i]) / 2;   
            if (avg >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        scan.close();
    }
}
