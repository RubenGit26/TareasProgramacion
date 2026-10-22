import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECIO_ADULTO = 12;
        final double PRECIO_INFANTIL = 8;
        final double PRECIO_BEBIDA = 1.5;

        System.out.println("¿Cuántos menús de adulto?");
        int menusAdulto = sc.nextInt();

        System.out.println("¿Cuántos menús infantiles?");
        int menusInfantil = sc.nextInt();

        System.out.println("¿Cuántas bebidas?");
        int bebidas = sc.nextInt();

        double total = menusAdulto * PRECIO_ADULTO
                + menusInfantil * PRECIO_INFANTIL
                + bebidas * PRECIO_BEBIDA;
        System.out.println("Importe total a pagar: " + total + "€");

        System.out.println("¿Qué cantidad abona el cliente?");
        double abonado = sc.nextDouble();

        double cambio = abonado - total;
        System.out.println("Cambio a devolver: " + cambio + "€");

        sc.close();
    }
}