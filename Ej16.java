public class Ej16 {
    public static void main(String[] args) {
        final double IRPF = 0.15;

        double sueldoB = 1600;

        double sueldoN = sueldoB - (IRPF * sueldoB);

        System.out.println("El sueldo meto de Paco es: " + sueldoN + "€");
    }
}
