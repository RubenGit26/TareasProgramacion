import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuánto cobras por hora en el trabajo?");
        double sueldo = sc.nextDouble();

        System.out.println("¿Cuántas horas le has dedicado a la reparación?");
        double horas = sc.nextDouble();

        double subTotal = (sueldo * horas);
        System.out.println("Subtotal de la mano de obra: " + subTotal + "€");

        System.out.println("IVA correspondiente será del 21%");
        System.out.println("Total a pagar: " + (subTotal * 1.21) + "€");

        sc.close();
    }
}
