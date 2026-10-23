import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el importe de la compra:");
        double importe = sc.nextDouble();

        double descuento = importe * 0.2;

        double precioFinal = (importe > 100) ? (importe - descuento) : importe;

        System.out.println("El importe de la compra es de: " + precioFinal + "€");

        sc.close();
    }
}
