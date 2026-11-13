import java.util.Scanner;

/**
 * Ej02: Pide un número del 1 al 10 (repite hasta que sea válido)
 * y muestra su tabla de multiplicar.
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Validación de la entrada
        do {
            System.out.print("Introduce un número del 1 al 10: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("Número fuera de rango, inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 10);

        // Tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
