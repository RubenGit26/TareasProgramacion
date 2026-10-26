public class Ej15 {
    public static void main(String[] args) {
        int hora = 23;
        boolean fiesta = true;
        boolean vecinoMolesto = true;

        // (23 >= 22 && true) es true; !vecinoMolesto es false; true && false -> false
        System.out.println((hora >= 22 && fiesta) && !vecinoMolesto);
    }
}