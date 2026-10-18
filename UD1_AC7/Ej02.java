import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // Recoge el intro pendiente del nextInt()

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: [" + nombre + "]");

        if (nombre.isEmpty()) {
            System.out.println("El nombre se ha quedado vacío porque nextLine() ha recogido el intro pendiente de nextInt().");
        }

        sc.close();
    }
}