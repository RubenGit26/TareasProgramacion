import java.util.Scanner;

/**
 * Ej04: Estadísticas de edades de alumnos. Se leen edades hasta que se
 * introduce un número negativo. Muestra total de alumnos, suma, media y
 * cuántos son mayores de edad (>= 18).
 */
public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = 0;
        int suma = 0;
        int mayoresEdad = 0;

        System.out.print("Introduce una edad (número negativo para terminar): ");
        int edad = sc.nextInt();

        while (edad >= 0) {
            alumnos++;
            suma += edad;
            if (edad >= 18) {
                mayoresEdad++;
            }

            System.out.print("Introduce una edad (número negativo para terminar): ");
            edad = sc.nextInt();
        }

        if (alumnos == 0) {
            System.out.println("No se introdujeron edades válidas.");
        } else {
            double media = (double) suma / alumnos;
            System.out.println();
            System.out.println("Número total de alumnos: " + alumnos);
            System.out.println("Suma total de las edades: " + suma);
            System.out.println("Edad media: " + media);
            System.out.println("Mayores de edad: " + mayoresEdad);
        }
        System.out.println("Programa finalizado.");
    }
}
