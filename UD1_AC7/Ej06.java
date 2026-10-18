import java.util.Locale;
import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce un número real (con punto, ej. 3.14): ");
        double numero = sc.nextDouble();

        System.out.printf(Locale.US, "El número introducido es: %.2f%n", numero);

        sc.close();
    }
}