public class Ej20 {
    public static void main(String[] args) {
        double precioSinIva = 50;

        final double IVA = 0.21;

        double precioFinalconIVA = (precioSinIva * IVA) + precioSinIva;

        System.out.println("El precio con IVA es: " + precioFinalconIVA + " €");
    }
}
