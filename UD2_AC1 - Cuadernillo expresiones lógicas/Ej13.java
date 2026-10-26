public class Ej13 {
    public static void main(String[] args) {
        boolean tieneClave = true;
        boolean biometria = false; // sin tilde para evitar problemas de codificación
        boolean admin = true;

        // (false || true) es true; true && true -> true
        System.out.println(tieneClave && (biometria || admin));
    }
}