import java.util.Scanner;

/**
 * Ej07: Pide la temperatura en grados y muestra su descripción:
 * Helada (<0), Fría (0-14), Agradable (15-25) o Calurosa (>25).
 * Se usa double para cubrir también valores decimales (ej. 14.5).
 */
public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados: ");
        double t = sc.nextDouble();

        if (t < 0) {
            System.out.println("Helada");
        } else if (t < 15) {
            System.out.println("Fría");
        } else if (t <= 25) {
            System.out.println("Agradable");
        } else {
            System.out.println("Calurosa");
        }
        sc.close();
    }
}
