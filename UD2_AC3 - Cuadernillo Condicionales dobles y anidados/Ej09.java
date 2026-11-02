import java.util.Scanner;

/**
 * Ej09: Pide la edad y muestra su categoría:
 * Edad no válida (<0), Infantil (<12), Juvenil (12-17) o Adulto (>=18).
 */
public class Ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad < 12) {
            System.out.println("Infantil");
        } else if (edad <= 17) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
        sc.close();
    }
}
