public class Ej10 {
    public static void main(String[] args) {
        int hora = 20;
        boolean invitado = true;
        boolean accesoVIP = false;

        // El rango horario es true
        // !invitado es false y accesoVIP es false -> false || false = false
        // true && false -> false
        System.out.println((hora >= 18 && hora <= 23) && (!invitado || accesoVIP));
    }
}