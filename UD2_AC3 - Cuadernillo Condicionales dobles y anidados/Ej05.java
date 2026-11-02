import java.util.Scanner;

/**
 * Ej05: Pide una temperatura en grados Celsius y la clasifica respecto
 * al punto de equilibrio. Se valida primero el rango razonable (-100 a 100).
 *
 * Nota: el enunciado no indica qué mostrar si la temperatura es exactamente
 * -1 o 1 (extremos excluidos de "estable"), por lo que se muestra
 * "En el punto de equilibrio".
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double t = sc.nextDouble();

        if (t < -100 || t > 100) {
            System.out.println("Temperatura fuera de rango");
        } else if (t > -1 && t < 1) {
            System.out.println("Temperatura estable");
        } else if (t < -1) {
            System.out.println("Por debajo del punto de equilibrio");
        } else if (t > 1) {
            System.out.println("Por encima del punto de equilibrio");
        } else {
            // t es exactamente -1 o 1
            System.out.println("En el punto de equilibrio");
        }
        sc.close();
    }
}
