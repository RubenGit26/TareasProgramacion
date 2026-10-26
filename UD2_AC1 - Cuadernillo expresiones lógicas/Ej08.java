public class Ej08 {
    public static void main(String[] args) {
        int hora = 21;
        boolean invitado = false;

        // El rango 18-23 se cumple (true); !invitado es true -> true
        System.out.println((hora >= 18 && hora <= 23) && !invitado);
    }
}