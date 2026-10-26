public class Ej10 {
    public static void main(String[] args) {
        boolean conectado = true;
        boolean autorizado = false;
        boolean esAdmin = true;

        if (conectado && !autorizado && !esAdmin) {
            System.out.println("Acceso restringido");
        }
    }
}