public class Ej05 {
    public static void main(String[] args) {
        String usuario = "admin";
        int clave = 1234;
        boolean activo = true;

        if (usuario.equals("admin") && clave == 1234 && activo) {
            System.out.println("Acceso concedido");
        }
    }
}