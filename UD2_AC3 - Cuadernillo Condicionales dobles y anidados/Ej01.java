import java.util.Scanner;

/**
 * Ej01: Solicita un número entero y muestra si es Cero, Positivo o Negativo.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Cero");
        } else if (n > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
