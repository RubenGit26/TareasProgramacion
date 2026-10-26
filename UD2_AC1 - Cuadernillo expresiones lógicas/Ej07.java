public class Ej07 {
    public static void main(String[] args) {
        int puntos = 45;
        boolean extra = true;

        // 45 >= 50 es false; (45 >= 40 && true) es true; false || true -> true
        System.out.println((puntos >= 50) || (puntos >= 40 && extra));
    }
}