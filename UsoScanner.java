import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca el género (H/M):");
        char genero = sc.nextLine().charAt(0);

        System.out.println("Introduzca el año de nacimiento:");
        int anoNacimiento = sc.nextInt();
        int edad = 2026 - anoNacimiento;

        System.out.println("Introduzca el número de teléfono:");
        long tlfn = sc.nextLong();

        System.out.println("Introduzca un número decimal:");
        double nDecimal = sc.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + tlfn);
        System.out.println("Promedio: " + nDecimal);


        sc.close();
    }
}
