import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();

        boolean dentroDelRango = num >= 0 && num <= 100;
        boolean fueraDelRango = num < 0 || num > 100;

        if (dentroDelRango && !fueraDelRango) {
            System.out.println(num + " está dentro del rango 0-100.");
        } else {
            System.out.println(num + " está fuera del rango 0-100.");
        }

        sc.close();
    }
}