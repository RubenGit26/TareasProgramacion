/**
 * Ej04: Igual que el Ej03 pero usando un bucle while.
 * Importante: el contador se incrementa al principio del cuerpo del bucle,
 * porque si se hiciera al final, el continue lo saltaría y habría un bucle infinito.
 */
public class Ej04 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 40) {
            i++; // se incrementa antes de cualquier continue

            if (i % 4 == 0) {
                System.out.println("ZAS!");
                continue;
            }
            if (i % 6 == 0) {
                System.out.println("BOOM!");
                continue;
            }
            if (i % 9 == 0) {
                System.out.println("CRASH!");
                continue;
            }
            // Cualquier otro caso: se muestra el número
            System.out.println(i);
        }
    }
}
