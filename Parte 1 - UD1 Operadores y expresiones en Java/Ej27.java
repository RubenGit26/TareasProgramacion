import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int b = sc.nextInt();

        int mayor = (a > b) ? a : b;

        System.out.println("El mayor de " + a + " y " + b + " es: " + mayor);

        sc.close();
    }
}