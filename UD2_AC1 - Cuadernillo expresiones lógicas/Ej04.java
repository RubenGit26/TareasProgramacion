public class Ej04 {
    public static void main(String[] args) {
        int nota = 6;
        boolean asistencia = false;

        // 6 >= 5 es true, pero asistencia == true es false -> false
        System.out.println((nota >= 5) && (asistencia == true));
    }
}