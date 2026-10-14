public class Ej13 {
    public static void main(String[] args) {
        int num = 2147483647 + 1;

        System.out.println(num);

        //Al sumarle 1, todos los 1 se “acarrean” hacia la izquierda y el resultado es: 10000000 00000000 00000000 00000000   (-2147483648) 
    }
}