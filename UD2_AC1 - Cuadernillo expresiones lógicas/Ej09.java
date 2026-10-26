public class Ej09 {
    public static void main(String[] args) {
        int puntos = 38;
        boolean extra = true;
        boolean penalizacion = false;

        // Primer bloque: 38 >= 40 es false -> false
        // Segundo bloque: 38 >= 35 es true y !penalizacion es true -> true
        // false || true -> true
        System.out.println((puntos >= 40 && extra) || (puntos >= 35 && !penalizacion));
    }
}