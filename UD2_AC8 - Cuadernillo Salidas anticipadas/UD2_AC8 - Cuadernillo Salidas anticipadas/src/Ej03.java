/**
 * Ej03: Recorre los números del 1 al 40 con un bucle for y muestra un texto
 * especial según el primer múltiplo que cumpla (4, 6 o 9). Sin else ni else if:
 * se usan solo if con continue para pasar al siguiente número.
 */
public class Ej03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
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
