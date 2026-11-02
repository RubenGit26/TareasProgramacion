import java.util.Scanner;

/**
 * Ej06: Solicita una nota (0-10) y muestra su calificación.
 * Resuelto con operadores ternarios anidados.
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota (0-10): ");
        double nota = sc.nextDouble();

        String resultado = (nota < 0 || nota > 10) ? "Nota no válida"
                         : (nota < 5) ? "Suspenso"
                         : (nota < 7) ? "Aprobado"
                         : (nota < 9) ? "Notable"
                         : "Sobresaliente";
        System.out.println(resultado);
        sc.close();
    }
}
