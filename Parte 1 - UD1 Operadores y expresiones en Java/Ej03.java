import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.1416;

        System.out.println("Introduzca el radio del circulo: ");
        double radio = sc.nextDouble();

        System.out.println("La longitud del circulo es (2 * radio * PI): " + (2 * radio * PI));

        sc.close();
    }
}
