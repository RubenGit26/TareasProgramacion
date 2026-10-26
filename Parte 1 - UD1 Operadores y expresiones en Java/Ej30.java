import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();

        num++;
        num++;
        num++;

        System.out.println("Valor final tras incrementar tres veces: " + num);

        String tipo = (num % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + num + " es " + tipo + ".");

        sc.close();
    }
}