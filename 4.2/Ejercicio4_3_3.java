/**
 * Ejercicio 4.3.3
 * Introducir nombre apellidos y coja las tres primeras iniciales de cada cadena
 * y forme una cadena nueva
 * 
 * @author Jose Luis Triano
 */

public class Ejercicio4_3_3 {
    public static void main(String[] args) {
        // Variables
        String tresnombre = "";
        String tres1Apellido = "";
        String tres2Apellido = "";
        // Pedir datos
        String nombre = System.console().readLine("Introduce tu nombre\n");
        String apellido1 = System.console().readLine("Introduce tu primer apellido\n");
        String apellido2 = System.console().readLine("Introduce tu segundo apellido\n");
        // recorrer la palabra con un indice e ir acumulandolas
        for (int i = 0; i < 3; i++) {
            char caracter = nombre.charAt(i);
            tresnombre = tresnombre + caracter;
        }
        for (int i = 0; i < 3; i++) {
            char caracter = apellido1.charAt(i);
            tres1Apellido = tres1Apellido + caracter;
        }
        for (int i = 0; i < 3; i++) {
            char caracter = apellido2.charAt(i);
            tres2Apellido = tres2Apellido + caracter;
        }
        String cadenaFinal = tresnombre + tres1Apellido + tres2Apellido;
        System.out.println(cadenaFinal.toUpperCase());
    }
}
