import java.util.Scanner;

/**
 * Ej10: Clasificación de una calificación entera (0-10).
 * Switch expression con flechas que produce un String.
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una calificación entera (0-10): ");
        int nota = sc.nextInt();

        String clasificacion = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Suspenso";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota no válida";
        };

        System.out.println(clasificacion);
    }
}
