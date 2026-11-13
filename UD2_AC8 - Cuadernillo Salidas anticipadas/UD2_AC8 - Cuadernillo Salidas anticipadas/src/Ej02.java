import java.util.Scanner;

/**
 * Ej02: Pide 10 números enteros con un bucle for y los va mostrando.
 * Si encuentra un número negativo, avisa y detiene el bucle (break).
 */
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo encontrado");
                break; // salida anticipada: no se piden más números
            }
            System.out.println("Has introducido: " + numero);
            
            sc.close();
        }
    }
}
