public class Ej04 {
    public static void main(String[] args) {
        double precio = 80;
        boolean clienteVIP = true;
        boolean descuentoActivo = false;

        if (precio > 50 && (clienteVIP || descuentoActivo)) {
            precio = precio - precio * 0.15;
        }

        System.out.println("Precio final: " + precio);
    }
}