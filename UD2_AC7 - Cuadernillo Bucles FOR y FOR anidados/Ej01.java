import java.util.Scanner;

/**
 * Ej01: Pide 10 números enteros por teclado y muestra la media.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            suma += sc.nextInt();
        }

        // Se divide entre 10.0 para obtener la media con decimales
        double media = suma / 10.0;
        System.out.println("La media es: " + media);
    }
}
