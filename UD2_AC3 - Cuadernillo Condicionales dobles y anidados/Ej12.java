import java.util.Scanner;

/**
 * Ej12: Pide un número entero y muestra si está dentro del rango 1-100
 * o fuera de él, indicando además si es par o impar.
 */
public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        String rango = (n >= 1 && n <= 100) ? "dentro del rango 1-100" : "fuera del rango 1-100";
        String paridad = (n % 2 == 0) ? "par" : "impar";

        System.out.println("El número está " + rango + " y es " + paridad);
        sc.close();
    }
}
