/**
 * Ej09: Muestra los números del 00 al 99 en 10 filas de 10 columnas.
 * Se usa decenas + "" + unidades para concatenar como texto en lugar de sumar.
 */
public class Ej09 {
    public static void main(String[] args) {
        for (int decenas = 0; decenas < 10; decenas++) {
            for (int unidades = 0; unidades < 10; unidades++) {
                System.out.print(decenas + "" + unidades + " ");
            }
            System.out.println();
        }
    }
}
