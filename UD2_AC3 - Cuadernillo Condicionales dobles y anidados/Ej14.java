import java.util.Scanner;

/**
 * Ej14: Pide el importe de una compra y muestra el descuento aplicable:
 * 0 % (< 50 €), 5 % (50-100 €) o 10 % (> 100 €).
 */
public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe de la compra (€): ");
        double importe = sc.nextDouble();

        if (importe < 50) {
            System.out.println("Descuento: 0 %");
        } else if (importe <= 100) {
            System.out.println("Descuento: 5 %");
        } else {
            System.out.println("Descuento: 10 %");
        }
        sc.close();
    }
}
