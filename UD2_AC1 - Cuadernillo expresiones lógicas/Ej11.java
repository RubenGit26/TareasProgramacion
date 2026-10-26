public class Ej11 {
    public static void main(String[] args) {
        int edad = 22;
        boolean carnet = true;
        boolean antecedentes = false;

        // (22 >= 18 && true) es true; !antecedentes es true -> true
        System.out.println((edad >= 18 && carnet) && !antecedentes);
    }
}