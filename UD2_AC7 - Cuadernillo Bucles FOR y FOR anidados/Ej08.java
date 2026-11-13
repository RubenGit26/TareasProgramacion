/**
 * Ej08: Muestra todos los números primos entre 1 y 300 (for anidados).
 * El 1 no se considera primo.
 */
public class Ej08 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 300:");

        // Bucle externo: candidatos (empiezan en 2, el 1 no es primo)
        for (int n = 2; n <= 300; n++) {
            boolean primo = true;

            // Bucle interno: busca divisores entre 2 y la raíz de n
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    primo = false;
                    break; // ya no hace falta seguir probando
                }
            }

            if (primo) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
