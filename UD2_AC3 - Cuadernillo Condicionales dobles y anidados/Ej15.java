import java.util.Scanner;

/**
 * Ej15: Pide una contraseña y muestra "Acceso concedido" si coincide
 * exactamente con "Java2025", o "Acceso denegado" si no.
 * Resuelto con un operador ternario (una sola expresión en el println).
 */
public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        String password = sc.next();

        System.out.println(password.equals("Java2025") ? "Acceso concedido" : "Acceso denegado");
        sc.close();
    }
}
