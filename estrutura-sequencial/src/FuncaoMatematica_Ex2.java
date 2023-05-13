public class FuncaoMatematica_Ex2 {
    
    public static void main(String[] args) {
        
        double a = 18.0; 
        double b = 15.0; 
        double c = 20.0; 
        double delta;
        double x1; 
        double x2;  

        delta = Math.pow(b, 2.0) - 4 * a * c; 

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
