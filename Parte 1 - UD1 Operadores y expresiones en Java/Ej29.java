public class Ej29 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        boolean resultado = (a + b * 2) > c || (c / a) < b;

        System.out.println("Resultado: " + resultado);

        // El resultado es true porque:
        // - Primera parte: a + b * 2 = 10 + 10 = 20, y 20 > 20 es false (no es estrictamente mayor).
        // - Segunda parte: c / a = 20 / 10 = 2, y 2 < 5 es true.
        // false || true = true, ya que con || basta con que una de las dos condiciones sea verdadera.
    }
}