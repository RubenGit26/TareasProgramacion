import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuánto dinero hay en la caja?");
        double dineroCaja = sc.nextDouble();

        System.out.println("Cantidad de gastos del mes:");
        double gastos = sc.nextDouble();

        double dineroTotal = (dineroCaja - gastos);
        System.out.println("Dinero total en caja: " + dineroTotal + "€");

        sc.close();
    }
}
