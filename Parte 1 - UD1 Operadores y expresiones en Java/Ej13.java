import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el número de segundos:");
        int total = sc.nextInt();

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

        sc.close();
    }
}