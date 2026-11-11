import java.util.Scanner;

/**
 * Ej03: Registra temperaturas hasta que se introduce -100 (centinela, no se
 * registra). Muestra la temperatura máxima y la mínima.
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxima = 0;
        double minima = 0;
        int contador = 0; // Cuántas temperaturas válidas se han registrado

        System.out.print("Introduce una temperatura (-100 para terminar): ");
        double temperatura = sc.nextDouble();

        while (temperatura != -100) {
            // La primera temperatura inicializa máximo y mínimo
            // (no se usa 0 como valor inicial porque puede haber solo negativas)
            if (contador == 0) {
                maxima = temperatura;
                minima = temperatura;
            } else {
                if (temperatura > maxima) {
                    maxima = temperatura;
                }
                if (temperatura < minima) {
                    minima = temperatura;
                }
            }
            contador++;

            System.out.print("Introduce una temperatura (-100 para terminar): ");
            temperatura = sc.nextDouble();
        }

        if (contador == 0) {
            System.out.println("No se han registrado temperaturas.");
        } else {
            System.out.println("Temperatura máxima: " + maxima);
            System.out.println("Temperatura mínima: " + minima);
        }
        System.out.println("Programa finalizado.");
    }
}
