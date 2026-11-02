import java.util.Scanner;

/**
 * Ej08: Solicita una hora (0-23) y muestra el saludo correspondiente:
 * Buenos días (7-12), Buenas tardes (13-20) o Buenas noches (21-6).
 */
public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora no válida");
        } else if (hora >= 7 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            // 21-23 y 0-6
            System.out.println("Buenas noches");
        }
        sc.close();
    }
}
