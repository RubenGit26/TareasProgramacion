import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
            System.out.println("Introduzca un número entero: ");
            int num = sc.nextInt();

            System.out.println("Introduzca una palabra: ");
            String palabra = sc.nextLine();

            System.out.println("Número: " + num);
            System.out.println("Palabra: " + palabra);

         Este programa daría esta salida, debido a que nos lee un enter de más
            Introduzca un número entero: 
            3
            Introduzca una palabra: 
            Número: 3
            Palabra:  
        */
       //Para ello, lo solucionaremos incrementando un sc.nextLine() a continuación del sc.nextInt()

        System.out.println("Introduzca un número entero: ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("\nNúmero: " + num);
        System.out.println("Palabra: " + palabra);
        

        sc.close();
    }
}