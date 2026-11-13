import java.util.Scanner;

/**
 * Ej04: Calcula el factorial de un número entre 0 y 12 con un bucle for.
 * Si el número está fuera del intervalo, muestra un mensaje de error.
 */
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero entre 0 y 12: ");
        int n = sc.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("Error: el número debe estar entre 0 y 12");
        } else {
            long factorial = 1; // 0! = 1 (el bucle no se ejecuta si n = 0)
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
}
