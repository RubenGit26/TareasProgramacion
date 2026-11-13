import java.util.Scanner;

/**
 * Ej06: Pide las calificaciones de 6 alumnos y muestra cuántos aprobados,
 * cuántos suspensos y cuántos de esos suspensos tienen exactamente un 4
 * (los 4 también cuentan dentro del total de suspensos).
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int suspensos = 0;
        int cuatros = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce la calificación del alumno " + i + ": ");
            double nota = sc.nextDouble();

            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
                if (nota == 4) {
                    cuatros++;
                }
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("Suspensos con un 4: " + cuatros);
    }
}
