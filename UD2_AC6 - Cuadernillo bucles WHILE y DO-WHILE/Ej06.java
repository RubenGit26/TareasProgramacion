import java.util.Random;
import java.util.Scanner;

/**
 * Ej06: Juego de cálculo mental. En cada ronda se generan dos números
 * aleatorios entre 1 y 100 y el usuario debe escribir su suma. El juego
 * continúa mientras acierte; al fallar muestra el total de aciertos.
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int aciertos = 0;
        boolean correcto;

        System.out.println("Juego de cálculo mental");
        System.out.println("Suma los números que aparecen. El juego termina cuando falles.");

        do {
            int a = rnd.nextInt(100) + 1;
            int b = rnd.nextInt(100) + 1;
            int solucion = a + b;

            System.out.println();
            System.out.print(a + " + " + b + " = ");
            int respuesta = sc.nextInt();

            correcto = (respuesta == solucion);
            if (correcto) {
                aciertos++;
                System.out.println("¡Correcto! Número de aciertos: " + aciertos);
            } else {
                System.out.println("Incorrecto. La respuesta era " + solucion + ".");
            }
        } while (correcto);

        System.out.println("Número total de aciertos consecutivos: " + aciertos);
        System.out.println("Fin del juego.");
    }
}
