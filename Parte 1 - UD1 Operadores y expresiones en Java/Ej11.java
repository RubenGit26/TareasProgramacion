import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Resolución de ecuaciones de segundo grado: ax² + bx + c = 0");

        System.out.println("Introduce el valor de a:");
        double a = sc.nextDouble();

        System.out.println("Introduce el valor de b:");
        double b = sc.nextDouble();

        System.out.println("Introduce el valor de c:");
        double c = sc.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No hay soluciones reales");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }

        sc.close();
    }
}