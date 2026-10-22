import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int n = sc.nextInt();

        int vAbs = (n >= 0) ? n : (-(n));

        System.out.println(vAbs);

        sc.close();
    }
}
