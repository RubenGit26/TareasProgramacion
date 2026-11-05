import java.util.Scanner;

/**
 * Ej01: Asignación familiar según el número de hijos.
 * Se valida con if que no sea negativo y se usa switch con flechas.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de hijos: ");
        int hijos = sc.nextInt();

        if (hijos < 0) {
            System.out.println("Error: el número de hijos no puede ser negativo");
        } else {
            switch (hijos) {
                case 0 -> System.out.println("No le corresponde asignación familiar");
                case 1 -> System.out.println("Le corresponden 50 euros");
                case 2 -> System.out.println("Le corresponden 75 euros en total");
                default -> System.out.println("Le corresponden 100 euros");
            }
        }
    }
}
