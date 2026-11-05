import java.util.Scanner;

/**
 * Ej05: Menú de operaciones (cubo, par/impar, salir).
 * Switch con dos puntos (case:) y break.
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Calcular el cubo de un número");
        System.out.println("2. Determinar si un número es par o impar");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce un número: ");
                int n1 = sc.nextInt();
                long cubo = (long) n1 * n1 * n1;
                System.out.println("El cubo de " + n1 + " es " + cubo);
                break;
            case 2:
                System.out.print("Introduce un número: ");
                int n2 = sc.nextInt();
                if (n2 % 2 == 0) {
                    System.out.println(n2 + " es par");
                } else {
                    System.out.println(n2 + " es impar");
                }
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Error: opción no válida");
                break;
        }
    }
}
