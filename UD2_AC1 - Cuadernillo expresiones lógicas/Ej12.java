public class Ej12 {
    public static void main(String[] args) {
        int temp = 15;
        boolean lluvia = true;
        boolean abrigo = false;

        // (15 < 20 && true) es true; con || basta que uno sea true -> true
        System.out.println((temp < 20 && lluvia) || abrigo);
    }
}