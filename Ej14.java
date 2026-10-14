public class Ej14 {

    public static void main(String[] args) {
        short num = 30000;
        num = (short) (num *10);

        System.out.println(num);
        //El (short) fuerza a meter ese 300000 de nuevo en un short.
    }
}