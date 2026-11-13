import java.util.Scanner;

/**
 * Ej13: Pide un número impar entre 3 y 9 (repite hasta que sea válido) y
 * dibuja una pirámide invertida de asteriscos cuya base tiene ese número
 * de asteriscos. Ejemplo con 5:
 *
 * *****
 *  ***
 *   *
 */
public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número impar entre 3 y 9: ");
            n = sc.nextInt();
        } while (n < 3 || n > 9 || n % 2 == 0);

        // Cada fila tiene 2 asteriscos menos que la anterior
        for (int i = n; i >= 1; i -= 2) {
            // Espacios para centrar
            for (int e = 1; e <= (n - i) / 2; e++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
