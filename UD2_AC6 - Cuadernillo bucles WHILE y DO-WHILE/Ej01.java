import java.util.Scanner;

/**
 * Ej01: Para cada número introducido muestra si es positivo/negativo,
 * si es par/impar y su cuadrado. Termina cuando se introduce 0.
 */
public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primera lectura antes del bucle (el 0 es el valor centinela)
        System.out.print("Introduce un número (0 para salir): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            // Signo
            if (numero > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }

            // Paridad
            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

            // Cuadrado (long para evitar desbordamiento)
            long cuadrado = (long) numero * numero;
            System.out.println("Su cuadrado es: " + cuadrado);

            // Siguiente lectura
            System.out.println();
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();
        }

        System.out.println("Programa finalizado.");
    }
}
