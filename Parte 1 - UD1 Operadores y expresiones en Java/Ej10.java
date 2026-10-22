import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el capital inicial (en euros):");
        double capitalInicial = sc.nextDouble();

        System.out.println("Introduce el tipo de interés anual (en %):");
        double interes = sc.nextDouble();

        System.out.println("Introduce el número de años:");
        int anios = sc.nextInt();

        double capitalFinal = capitalInicial * Math.pow(1 + (interes / 100), anios);

        System.out.println("Con un capital inicial de " + capitalInicial + "€, un interés del "
                + interes + "% anual durante " + anios + " años, el capital final será de "
                + capitalFinal + "€");

        sc.close();
    }
}