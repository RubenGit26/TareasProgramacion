public class Ej05 {
    public static void main(String[] args) {
        int temperatura = 30;
        boolean llueve = false;

        // (true && false) es false; !false -> true
        System.out.println(!(temperatura > 25 && llueve));
    }
}