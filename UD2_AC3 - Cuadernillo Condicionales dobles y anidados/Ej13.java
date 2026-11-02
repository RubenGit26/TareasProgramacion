import java.util.Scanner;

/**
 * Ej13: Pide un año y muestra si pertenece al siglo XX (1901-2000),
 * al siglo XXI (2001-2100) o "Fuera de rango".
 */
public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();

        if (anio >= 1901 && anio <= 2000) {
            System.out.println("Siglo XX");
        } else if (anio >= 2001 && anio <= 2100) {
            System.out.println("Siglo XXI");
        } else {
            System.out.println("Fuera de rango");
        }
        sc.close();
    }
}
