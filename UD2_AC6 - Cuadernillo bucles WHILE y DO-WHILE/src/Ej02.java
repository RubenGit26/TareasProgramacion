/**
 * Ej02: Muestra el cuadrado de los números naturales empezando en 0,
 * mientras el cuadrado sea menor que 100.
 */
public class Ej02 {
    public static void main(String[] args) {
        int n = 0;

        while (n * n < 100) {
            System.out.println("El cuadrado de " + n + " es " + (n * n));
            n++;
        }

        // n ya es el primer número cuyo cuadrado es >= 100
        System.out.println("Fin del programa. El siguiente cuadrado sería " + (n * n) + " o mayor.");
    }
}
