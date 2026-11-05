import java.util.Scanner;

/**
 * Ej08: Operaciones con cadenas de texto (concatenar, comparar, longitud).
 * Switch expression con flechas que produce directamente un String, sin yield.
 */
public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String c1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String c2 = sc.nextLine();

        System.out.println("1. Concatenar ambas cadenas");
        System.out.println("2. Comparar las cadenas");
        System.out.println("3. Mostrar la longitud de cada cadena");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        String mensaje = switch (opcion) {
            case 1 -> "La concatenación de las dos cadenas es: " + c1 + c2;
            case 2 -> c1.equals(c2) ? "Las cadenas son iguales" : "Las cadenas son distintas";
            case 3 -> "La primera cadena tiene " + c1.length()
                    + " caracteres y la segunda " + c2.length();
            default -> "Error: opción no válida";
        };

        System.out.println(mensaje);
    }
}
