import java.util.Scanner;

/**
 * Ej03: Posición numérica (1-7) de un día de la semana.
 * Switch expression con dos puntos (case:) y yield; produce -1 si no es válido.
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (en minúsculas): ");
        String dia = sc.next();

        int posicion = switch (dia) {
            case "lunes":
                yield 1;
            case "martes":
                yield 2;
            case "miércoles":
                yield 3;
            case "jueves":
                yield 4;
            case "viernes":
                yield 5;
            case "sábado":
                yield 6;
            case "domingo":
                yield 7;
            default:
                yield -1;
        };

        if (posicion == -1) {
            System.out.println("Error: día de la semana no válido");
        } else {
            System.out.println(dia + " → " + posicion);
        }
    }
}
