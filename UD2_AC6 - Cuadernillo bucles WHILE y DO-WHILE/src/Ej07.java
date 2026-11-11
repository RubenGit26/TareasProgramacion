/**
 * Ej07: Muestra los términos de la serie de Fibonacci menores que 10.000
 * y cuántos términos se han generado.
 */
public class Ej07 {
    public static void main(String[] args) {
        int anterior = 0;  // término actual
        int siguiente = 1; // término siguiente
        int total = 0;

        System.out.println("Serie de Fibonacci menor que 10.000:");

        while (anterior < 10000) {
            // Coma de separación antes de todos los términos menos el primero
            if (total > 0) {
                System.out.print(", ");
            }
            System.out.print(anterior);
            total++;

            // Avanza la serie
            int suma = anterior + siguiente;
            anterior = siguiente;
            siguiente = suma;
        }

        System.out.println();
        System.out.println();
        System.out.println("Número total de términos generados: " + total);
        System.out.println("Fin del programa.");
    }
}
