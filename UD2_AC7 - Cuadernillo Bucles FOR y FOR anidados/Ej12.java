import java.util.Scanner;

/**
 * Ej12: Pide un número impar entre 3 y 9 (repite hasta que sea válido) y
 * muestra una pirámide numérica creciente con ese número de filas.
 * Por cada fila hay tres bucles internos: espacios, números ascendentes
 * y números descendentes. Ejemplo con 5:
 *
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 */
public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número impar entre 3 y 9: ");
            n = sc.nextInt();
        } while (n < 3 || n > 9 || n % 2 == 0);

        for (int fila = 1; fila <= n; fila++) {
            // 1) Espacios de la izquierda
            for (int e = 1; e <= n - fila; e++) {
                System.out.print(" ");
            }
            // 2) Números ascendentes: 1..fila
            for (int a = 1; a <= fila; a++) {
                System.out.print(a);
            }
            // 3) Números descendentes: fila-1..1
            for (int d = fila - 1; d >= 1; d--) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
