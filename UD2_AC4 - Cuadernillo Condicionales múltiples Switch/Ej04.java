import java.util.Scanner;

/**
 * Ej04: Estación del año según el número de mes (1-12).
 * Switch expression con flechas, sin yield, agrupando los meses de cada estación.
 */
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        String resultado = switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes no válido";
        };

        System.out.println(resultado);
    }
}
