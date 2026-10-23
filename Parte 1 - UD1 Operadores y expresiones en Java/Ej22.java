import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();

        System.out.println("Número: " + num + "\nNúmero prefijo(++): " + (++num) + "\nNúmero prefijo(--): " + (--num) + "\nNúmero postfijo(++): " + (num++) + "\nNúmero postfijo(--): " + (num--));

        sc.close();
    }
}
