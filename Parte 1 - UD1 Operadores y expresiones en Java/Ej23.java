public class Ej23 {
    public static void main(String[] args) {
        int resultado = 10 + 2 * 3 - 4;
        int resultado2 = (10 + 2) * (3 - 4);

        System.out.println("Resultado 1, 10 + 2 * 3 - 4 = " + resultado);
        System.out.println("Resultado 2, (10 + 2) * (3 - 4) = " + resultado2);

        //Los resultados son distintos debido a q según la norma en matemáticas, siempre se le da prioridad a los paréntesis, para realizar un cálculo
        
    }
}
