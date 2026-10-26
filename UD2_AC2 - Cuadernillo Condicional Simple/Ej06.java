import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Introduzca el tercer número: ");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("Orden correcto");
        }

        sc.close();
    }
}