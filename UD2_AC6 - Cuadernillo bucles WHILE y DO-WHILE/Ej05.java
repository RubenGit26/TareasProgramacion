import java.util.Random;
import java.util.Scanner;

/**
 * Ej05: Juego del número secreto. El programa genera un número aleatorio
 * entre 1 y 100 y da pistas hasta que se acierta o el usuario se rinde (-1).
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int secreto = rnd.nextInt(100) + 1; // 1..100
        int intento;

        System.out.println("¡Bienvenido al juego del número secreto!");
        System.out.println("Intenta adivinar un número entre 1 y 100.");
        System.out.println("Escribe -1 si te rindes.");
        System.out.println();

        do {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();

            if (intento == -1) {
                System.out.println("Te has rendido. El número secreto era " + secreto + ".");
            } else if (intento == secreto) {
                System.out.println("¡Has acertado! El número secreto era " + secreto + ".");
            } else if (intento < secreto) {
                System.out.println("Mi número secreto es mayor.");
            } else {
                System.out.println("Mi número secreto es menor.");
            }
        } while (intento != -1 && intento != secreto);

        System.out.println("Fin del juego.");
    }
}
