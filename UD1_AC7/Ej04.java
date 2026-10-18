import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int b = sc.nextInt();

        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es " + suma);

        sc.close();
    }
}