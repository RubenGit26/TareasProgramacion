import java.util.Scanner;

/**
 * Ej06: Cálculo del área de una figura geométrica.
 * Switch expression con flechas, bloques entre llaves y yield.
 * Si la opción no es válida se devuelve -1.
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: Triángulo");
        System.out.println("b: Cuadrado");
        System.out.println("c: Círculo");
        System.out.println("d: Rectángulo");
        System.out.print("Elige una opción (a, b, c o d): ");
        char opcion = sc.next().charAt(0);

        double area = switch (opcion) {
            case 'a' -> {
                System.out.print("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double altura = sc.nextDouble();
                yield base * altura / 2;
            }
            case 'b' -> {
                System.out.print("Introduce el lado: ");
                double lado = sc.nextDouble();
                yield lado * lado;
            }
            case 'c' -> {
                System.out.print("Introduce el radio: ");
                double radio = sc.nextDouble();
                yield Math.PI * radio * radio;
            }
            case 'd' -> {
                System.out.print("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.print("Introduce la altura: ");
                double altura = sc.nextDouble();
                yield base * altura;
            }
            default -> {
                yield -1;
            }
        };

        if (area < 0) {
            System.out.println("Error: opción no válida");
        } else {
            System.out.printf("El área es: %.2f%n", area);
        }
    }
}
