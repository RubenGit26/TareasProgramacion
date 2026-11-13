/**
 * Ej01: Muestra los números del 1 al 100 y detiene el bucle (break) cuando
 * encuentra el primer número múltiplo de 13 y de 5 a la vez.
 */
public class Ej01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0 && i % 5 == 0) {
                System.out.println("Primer múltiplo de 13 y de 5 encontrado: " + i);
                break; // salida anticipada del bucle
            }
            System.out.println(i);
        }
    }
}
