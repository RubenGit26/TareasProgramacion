import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpia el buffer (consume el intro pendiente)

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);

        sc.close();
    }
}