import java.util.Scanner;

/**
 * Ej02: Sueldo semanal según horas trabajadas y categoría (A, B, C o D).
 * Switch expression con flechas; el default usa un bloque con yield
 * que devuelve -1 para indicar categoría no válida.
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("Introduce la categoría (A, B, C o D): ");
        char categoria = sc.next().charAt(0);

        double sueldo = switch (categoria) {
            case 'A' -> horas * 25;
            case 'B' -> horas * 20;
            case 'C' -> horas * 15;
            case 'D' -> horas * 10;
            default -> {
                yield -1;
            }
        };

        if (sueldo < 0) {
            System.out.println("Error: categoría no válida");
        } else {
            System.out.println("Sueldo semanal: " + sueldo + " euros");
        }
    }
}
