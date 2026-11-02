import java.util.Scanner;

/**
 * Ej03: Pide dos números y muestra cuál es mayor o si son iguales.
 * Resuelto con operadores ternarios anidados (sin if-else).
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        String resultado = (a > b) ? "El primero es mayor"
                         : (b > a) ? "El segundo es mayor"
                         : "Son iguales";
        System.out.println(resultado);
        sc.close();
    }
}
