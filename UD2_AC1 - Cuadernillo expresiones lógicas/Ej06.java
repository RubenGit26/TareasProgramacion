public class Ej06 {
    public static void main(String[] args) {
        int edad = 16;
        boolean permisoPadres = true;

        // !(16 >= 18) es !false = true; true && true -> true
        System.out.println(!(edad >= 18) && permisoPadres);
    }
}