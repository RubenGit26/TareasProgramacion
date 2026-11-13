import java.util.Scanner;

/**
 * Ej11: Pide un número entre 2 y 9 (repite hasta que sea válido) y dibuja
 * un triángulo invertido de asteriscos, indicando entre paréntesis el valor de la fila.
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Dime un número mayor que 1 : ");
            num = sc.nextInt();
        } while (num < 2 || num > 9);

        // Bucle externo: de num hasta 1 (triángulo invertido)
        for (int i = num; i >= 1; i--) {
            // Bucle interno: i asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + i + ")");
        }
    }
}
