import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la temperatura actual: ");
        double temp = sc.nextDouble();

        System.out.println("¿Está lloviendo? (true/false)");
        boolean lluvia = sc.nextBoolean();

        if (!lluvia && temp > 25 && temp < 35) {
            System.out.println("Día perfecto para la playa");
        }

        sc.close();
    }
}
