import java.util.Scanner;

/**
 * Ej10: Pide filas y columnas (mayores que 0) y dibuja un rectángulo de asteriscos.
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;

        do {
            System.out.print("Número de filas (mayor que 0): ");
            filas = sc.nextInt();
        } while (filas <= 0);

        do {
            System.out.print("Número de columnas (mayor que 0): ");
            columnas = sc.nextInt();
        } while (columnas <= 0);

        for (int f = 1; f <= filas; f++) {
            for (int c = 1; c <= columnas; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
