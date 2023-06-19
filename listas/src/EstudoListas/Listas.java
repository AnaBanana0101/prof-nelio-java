package EstudoListas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        
        //Adicionando elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Inserindo um elemento em local especifico da lista
        list.add(2, "Marco");

        //"Imprimindo" o tamamho da lista criada 
        System.out.println(list.size());

        //Removendo da lista a partir de comparação de dados.
        // list.remove("Anna");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------");
        //Removendo da lista a partir de posição. 
        // list.remove(1);
        //Removendo da lista a partir de letra selecionada. 
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------");
        //posição do elemento na lista.
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        //quando o inderxOf não encontra o elemento ele retornará -1. 
        System.out.println("Index of Bob: " + list.indexOf("Maria"));

        System.out.println("----------------");
        //seleção e criação de nova lista contendo apenas os nomes começados com A; 
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------");
        //encontrar o primeiro elemento que começa com a letra A; 
        String name = list.stream().filter(x -> x.charAt(0) == 'A'). findFirst().orElse(null);
        System.out.println(name);

        System.out.println("----------------");
        //se não for encontrado nenhum elemento com a letra correspondente, será gerado um null. 
        String name1 = list.stream().filter(x -> x.charAt(0) == 'J'). findFirst().orElse(null);
        System.out.println(name1);

        
    }
}
