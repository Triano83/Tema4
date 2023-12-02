/**
 * Introducir una cadena de palabras y que te diga cada una de las palabras por
 * linea
 * 
 * @author Jose Luis Triano
 */
public class Ejercicio4_3_1 {
    public static void main(String[] args) {

        String cadena = System.console().readLine("Introduce una frase\n");
        String[] arrayCadena = cadena.split(" ");
        System.out.println();
        for (int i = 0; i < arrayCadena.length; i++) {
            System.out.println(arrayCadena[i]);
        }
        System.out.println();

    }
}
