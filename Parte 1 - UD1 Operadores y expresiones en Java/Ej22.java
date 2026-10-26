import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();

        int a = num, b = num, c = num, d = num;

        System.out.println("Número original: " + num);
        System.out.println("Prefijo (++):  devuelve " + (++a) + " | queda en " + a);
        System.out.println("Prefijo (--):  devuelve " + (--b) + " | queda en " + b);
        System.out.println("Postfijo (++): devuelve " + (c++) + " | queda en " + c);
        System.out.println("Postfijo (--): devuelve " + (d--) + " | queda en " + d);

        sc.close();
    }
}