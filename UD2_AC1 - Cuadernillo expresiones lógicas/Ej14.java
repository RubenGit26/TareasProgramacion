public class Ej14 {
    public static void main(String[] args) {
        int edad = 17;
        boolean padrePresente = true;
        boolean permisoEspecial = false;

        // 17 >= 18 es false; (true && false) es false; false || false -> false
        System.out.println((edad >= 18) || (padrePresente && permisoEspecial));
    }
}