import java.util.Scanner;

/**
 * Ej01: Pide un número entre 3 y 10 (repite hasta que sea válido) y dibuja
 * un cuadrado hueco de asteriscos de ese lado. El interior son espacios.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número entre 3 y 10: ");
            n = sc.nextInt();
        } while (n < 3 || n > 10);

        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= n; col++) {
                // Asterisco en la primera/última fila y en la primera/última columna
                if (fila == 1 || fila == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // Espacio de separación entre posiciones (salvo tras la última)
                if (col < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
