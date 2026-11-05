import java.util.Scanner;

/**
 * Ej09: Validación de una fecha (sin años bisiestos: febrero tiene 28 días).
 * Un switch expression obtiene los días máximos del mes (0 si el mes no es válido).
 */
public class Ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        int diasMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (anio != 0 && diasMes > 0 && dia >= 1 && dia <= diasMes) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es válida");
        }
    }
}
