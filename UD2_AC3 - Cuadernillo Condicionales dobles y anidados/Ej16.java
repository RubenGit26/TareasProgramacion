import java.util.Scanner;

/**
 * Ej16: Pide un carácter y determina si es una vocal minúscula,
 * vocal mayúscula o no es vocal.
 */
public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es una vocal minúscula");
        } else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Es una vocal mayúscula");
        } else {
            System.out.println("No es una vocal");
        }
        sc.close();
    }
}
