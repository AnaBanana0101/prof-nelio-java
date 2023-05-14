public class CondicionalTernaria {

     public static void main(String[] args) {
       

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

//sintaxe:
// (condição) ? valor_se_for_verdadeiro : valor_se falso
//se a condição for verdadeira, se aplica a primeira parte, antes dos :
//se a condição for falsa, se aplica a ultima parte, pós :

        
//forma resumida de: 

        // double preco = 34.5; 
        // double desconto;
        
        // if (preco < 20.0) {
        //     desconto = preco * 0.1;
        // }
        // else {
        //     desconto = preco * 0.05;
        // }

        // System.out.println(desconto);
     }


}
