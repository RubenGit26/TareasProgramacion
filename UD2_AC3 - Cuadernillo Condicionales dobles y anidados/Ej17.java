import java.util.Scanner;

/**
 * Ej17: Solicita tres números y muestra cuál es el mayor.
 * En caso de igualdad, muestra "Hay números iguales".
 */
public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println("Hay números iguales");
        } else if (a > b && a > c) {
            System.out.println("El mayor es el primero: " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es el segundo: " + b);
        } else {
            System.out.println("El mayor es el tercero: " + c);
        }
        sc.close();
    }
}
