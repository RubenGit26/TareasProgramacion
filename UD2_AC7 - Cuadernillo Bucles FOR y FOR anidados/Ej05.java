import java.util.Scanner;

/**
 * Ej05: Pide 5 calificaciones y dice si hay alguna suspensa (< 5).
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean haySuspenso = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la calificación del alumno " + i + ": ");
            double nota = sc.nextDouble();
            if (nota < 5) {
                haySuspenso = true;
            }
        }

        if (haySuspenso) {
            System.out.println("Hay al menos un alumno suspenso");
        } else {
            System.out.println("No hay ningún alumno suspenso");
        }
    }
}
