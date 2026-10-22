import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num = sc.nextInt();

        String num2 = (num % 2 == 0) ? "Par" : "Impar";
    
        System.out.println("El número es: " + num2);
        sc.close();
    }
}
