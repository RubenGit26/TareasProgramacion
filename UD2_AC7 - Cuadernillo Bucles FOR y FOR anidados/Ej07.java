import java.util.Scanner;

/**
 * Ej07: Pide un número entero positivo e indica si es primo.
 * Un primo tiene exactamente dos divisores: 1 y él mismo (el 1 no es primo).
 */
public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (n <= 0);

        boolean primo = n > 1;

        // Basta probar divisores hasta la raíz cuadrada de n
        for (int i = 2; i * i <= n && primo; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(n + " es un número primo");
        } else {
            System.out.println(n + " no es un número primo");
        }
    }
}
