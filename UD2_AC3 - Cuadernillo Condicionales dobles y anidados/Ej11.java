import java.util.Scanner;

/**
 * Ej11: Solicita dos números y muestra si ambos son positivos,
 * ambos negativos o de signo distinto.
 * (Si alguno es cero se considera que no son del mismo signo.)
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = sc.nextDouble();

        if (a > 0 && b > 0) {
            System.out.println("Ambos son positivos");
        } else if (a < 0 && b < 0) {
            System.out.println("Ambos son negativos");
        } else {
            System.out.println("Son de signo distinto");
        }
        sc.close();
    }
}
