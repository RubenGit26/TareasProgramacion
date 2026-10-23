import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca tus notas de cada trabajo:");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("La nota media es de: " + Math.round(media));

        sc.close();
    }
}
