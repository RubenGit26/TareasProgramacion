import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del producto:");
        double precio = sc.nextDouble();

        System.out.println("Introduce el porcentaje de descuento:");
        double porcentaje = sc.nextDouble();

        double descuento = precio * porcentaje / 100;
        double precioFinal = precio - descuento;

        System.out.println("Cantidad descontada: " + descuento + "€");
        System.out.println("Precio final: " + precioFinal + "€");

        sc.close();
    }
}