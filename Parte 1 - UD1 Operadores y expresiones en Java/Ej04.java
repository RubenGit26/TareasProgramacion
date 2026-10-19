import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double km = 1.609;
        
        System.out.println("Introduzca cuántas Millas hay de tu casa al instituto:");
        double millas = sc.nextDouble();

        System.out.println("La distancia de tu casa al instituto en Kilómetros es de (1,609 * millas): " + (km * millas));

        sc.close();
    }
}
