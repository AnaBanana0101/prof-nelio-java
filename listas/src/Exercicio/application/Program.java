package Exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio.entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>(); 

        System.out.print("How many employees will be registered? ");
        int numberEmployees = scan.nextInt(); 

        for (int i = 1; i <= numberEmployees; i++) {

            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            Integer id = scan.nextInt(); 
            
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = scan.nextInt(); 
            }

            System.out.print("Name: ");
            scan.nextLine(); 
            String name = scan.nextLine();
            System.out.print("Salary: ");
            Double salary = scan.nextDouble();

            Employee emp = new Employee(name, id, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int idSalary = scan.nextInt();
        
        /*
        Busca usando busca atraves do list.stream, transformando a lista em stream, essa sendo de alta ordem, 
        aceitando assim funções lambda. 
        A função filter filtrará a lista, aceitando apenas os elementos que atenderem o predicado em parenteses. 
        Depois de filtrado, é utilizado o comando findFirst para pegar o primeiro elemento que o obedecer o predicado. 
        Se nenhum componente for achado, "cairá" no comando orElse, esse que retornará nulo. 

        Linha utilizada para buscar na lista a primeira ocorrência de um funcionário q tenha o Id igual ao inserido no scanner. 
         */ 
        Employee emp = list.stream().filter(x -> x.getId() == idSalary). findFirst().orElse(null);


//Outra forma de descobrir a ocorrencia na lista, juntamente com a função secundária.
        /*
        Integer pos = position(list, idSalary);
        if (pos == null) {
            System.out.println("This ID does not exist! \r\n");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scan.nextDouble(); 
            list.get(pos).increaseSalary(percent);
        }
         */

        if (emp == null) {
            System.out.println("This ID does not exist! \r\n");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scan.nextDouble(); 
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list){
            System.out.println(e);
        }
        
        scan.close();
    }

/*
Função criada para identificar a posição do funcioário na lista

    public static Integer position(List<Employee> list, int id) {
        //list.size é o tamanho da lista criada
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i; 
            }
        }
        return null;
    }
 */

 //Função responsável por identificar se existe este id ou não. 
public static boolean hasId(List<Employee> list, int id) {
    Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return emp != null; 
}
}
