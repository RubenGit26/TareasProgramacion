import java.util.Scanner;

/**
 * Ej04: Pide un número y muestra si está dentro del rango [10, 50] o fuera de él.
 */
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double n = sc.nextDouble();

        if (n >= 10 && n <= 50) {
            System.out.println("Está dentro del rango [10, 50]");
        } else {
            System.out.println("Está fuera del rango [10, 50]");
        }
        sc.close();
    }
}
