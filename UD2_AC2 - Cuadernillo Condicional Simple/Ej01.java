import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println("Tiene carnet de conducir (true/false): ");
        boolean carnet = sc.nextBoolean();

        if (edad >= 18 && edad <= 65 && carnet) {
            System.out.println("Acceso permitido");
        }

        sc.close();
    }
}