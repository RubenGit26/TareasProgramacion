import java.util.Locale;
import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Locale es = Locale.of("es", "ES");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(es);

        System.out.print("Introduce un número real (con coma, ej. 3,14): ");
        double numero = sc.nextDouble();

        System.out.printf(es, "El número introducido es: %.2f%n", numero);

        sc.close();
    }
}