import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();

        System.out.println("El doble de ese número es: " + (num * 2));

        System.out.println("Introduzca ahora un número decimal: ");
        double numDec = sc.nextDouble();

        System.out.println("El número decimal dividido entre 10 es: " + (numDec / 10));
 
        sc.close();
    }
}