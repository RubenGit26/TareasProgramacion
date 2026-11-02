import java.util.Scanner;

/**
 * Ej18: Pide los tres lados de un triángulo y determina si es
 * equilátero, isósceles o escaleno.
 * Se valida que los lados sean positivos.
 */
public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el lado 3: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Los lados deben ser mayores que 0");
        } else if (a == b && b == c) {
            System.out.println("Triángulo equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno");
        }
        sc.close();
    }
}
