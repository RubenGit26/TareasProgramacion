/**
 * Ej03: Calcula la suma de los 10 primeros números impares.
 */
public class Ej03 {
    public static void main(String[] args) {
        int suma = 0;

        // El i-ésimo impar (empezando en i = 0) es 2*i + 1
        for (int i = 0; i < 10; i++) {
            suma += 2 * i + 1;
        }

        System.out.println("La suma de los 10 primeros números impares es: " + suma);
    }
}
