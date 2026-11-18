import java.util.Scanner;

/**
 * Ej02: Pide filas (3-9) y columnas (4-12), repitiendo cada petición hasta que
 * sea válida, y dibuja un rectángulo hueco cuyo borde está formado por el
 * número de cada fila. Ejemplo con 5 filas y 7 columnas:
 *
 * 1111111
 * 2     2
 * 3     3
 * 4     4
 * 5555555
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;
        
        do {
            System.out.print("Número de filas (3-9): ");
            filas = sc.nextInt();
        } while (filas < 3 || filas > 9);
        
        do {
            System.out.print("Número de columnas (4-12): ");
            columnas = sc.nextInt();
        } while (columnas < 4 || columnas > 12);
        
        for (int fila = 1; fila <= filas; fila++) {
            for (int col = 1; col <= columnas; col++) {
                // Primera/última fila: toda la fila. Filas intermedias: solo los extremos.
                if (fila == 1 || fila == filas || col == 1 || col == columnas) {
                    System.out.print(fila);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
