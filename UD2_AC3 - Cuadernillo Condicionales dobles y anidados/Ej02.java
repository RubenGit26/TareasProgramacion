import java.util.Scanner;

/**
 * Ej02: Pide un número entero y muestra si es par y mayor que 10,
 * o si no cumple ambas condiciones.
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n > 10) {
            System.out.println("Es par y mayor que 10");
        } else {
            System.out.println("No cumple ambas condiciones");
        }
        sc.close();
    }
}
