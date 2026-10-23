import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números enteros:");
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        int suma = n1 += n2;
        int resta = n1 -= n2;

        System.out.println("Suma: " + suma + "\nResta: " + resta);


        sc.close();
    }
}
