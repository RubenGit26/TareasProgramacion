import java.util.Scanner;

/**
 * Ej10: Solicita un número entero y muestra si es múltiplo de 3, de 5,
 * de ambos o de ninguno.
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        boolean mult3 = n % 3 == 0;
        boolean mult5 = n % 5 == 0;

        if (mult3 && mult5) {
            System.out.println("Es múltiplo de 3 y de 5");
        } else if (mult3) {
            System.out.println("Es múltiplo de 3");
        } else if (mult5) {
            System.out.println("Es múltiplo de 5");
        } else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }
        sc.close();
    }
}
