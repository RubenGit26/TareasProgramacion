import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca dos números enteros: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("División entera (num1 / num2) = " + (num1 / num2));
        System.out.println("División real ((double) num1 / num2) = " + ((double) num1 / num2));

        sc.close();
    }
}