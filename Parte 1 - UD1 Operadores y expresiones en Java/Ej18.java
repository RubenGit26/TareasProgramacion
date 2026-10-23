import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();

        double suma = n1 + n2 + n3;

        System.out.println("Resultado sin decimales: " + (int) suma);

        sc.close();
    }
}
