import java.util.Scanner;

/**
 * Ej14: Pide un número impar entre 3 y 9 (repite hasta que sea válido) y
 * dibuja un rombo de asteriscos centrado y simétrico, con altura y anchura
 * máxima iguales al número. Ejemplo con 5:
 *
 *   *
 *  ***
 * *****
 *  ***
 *   *
 */
public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número impar entre 3 y 9: ");
            n = sc.nextInt();
        } while (n < 3 || n > 9 || n % 2 == 0);

        // Parte superior (incluye la fila central): asteriscos 1, 3, ..., n
        for (int i = 1; i <= n; i += 2) {
            for (int e = 1; e <= (n - i) / 2; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior: asteriscos n-2, n-4, ..., 1
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int e = 1; e <= (n - i) / 2; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
