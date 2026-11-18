import java.util.Scanner;

/**
 * Ej04: Pide un número impar entre 5 y 11 (repite hasta que sea válido) y
 * dibuja un cuadrado hueco de asteriscos que contiene también sus dos diagonales.
 * Las posiciones que no son borde ni diagonal se rellenan con espacios.
 */
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número impar entre 5 y 11: ");
            n = sc.nextInt();
        } while (n < 5 || n > 11 || n % 2 == 0);

        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= n; col++) {
                boolean borde = (fila == 1 || fila == n || col == 1 || col == n);
                boolean diagonalPrincipal = (fila == col);
                boolean diagonalSecundaria = (fila + col == n + 1);

                if (borde || diagonalPrincipal || diagonalSecundaria) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
