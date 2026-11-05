import java.util.Scanner;

/**
 * Ej07: Clasificación de triángulos (equilátero, isósceles o escaleno).
 * Se cuentan las parejas de lados iguales y se usa switch con flechas:
 * 3 parejas = equilátero, 1 pareja = isósceles, 0 parejas = escaleno.
 */
public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el lado 3: ");
        double c = sc.nextDouble();

        int parejas = 0;
        if (a == b) {
            parejas++;
        }
        if (a == c) {
            parejas++;
        }
        if (b == c) {
            parejas++;
        }

        switch (parejas) {
            case 3 -> System.out.println("Triángulo equilátero");
            case 1 -> System.out.println("Triángulo isósceles");
            case 0 -> System.out.println("Triángulo escaleno");
            default -> System.out.println("Datos no válidos");
        }
    }
}
