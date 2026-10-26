import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();

        
        System.out.println("División como real = " + ((double)num / 2));

        sc.close();
    }
}
