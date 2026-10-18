import java.util.Locale;
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Locale es = Locale.of("es", "ES");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(es);

        System.out.print("Introduce el primer número decimal (ej. 2,5): ");
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo número decimal (ej. 1,75): ");
        double b = sc.nextDouble();

        double suma = a + b;
        System.out.printf(es, "La suma de %.2f y %.2f es %.2f%n", a, b, suma);

        sc.close();
    }
}