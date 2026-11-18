import java.util.Scanner;

/**
 * Ej03: Pide un número entre 3 y 10 (repite hasta que sea válido) y dibuja un
 * tablero N x N alternando X y O. La esquina superior izquierda es siempre X:
 * si fila + columna es par se imprime X, y si es impar, O.
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número entre 3 y 10: ");
            n = sc.nextInt();
        } while (n < 3 || n > 10);

        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= n; col++) {
                if ((fila + col) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
                if (col < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
