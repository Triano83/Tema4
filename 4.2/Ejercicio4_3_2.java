/**
 * Ejercicio 4.3.2
 * Introducir dos cadenas y compruebe si son iguales
 * 
 * @author Jose Luis Triano
 */

public class Ejercicio4_3_2 {
    public static void main(String[] args) {
        String cadena1 = System.console().readLine("Introduce cadena de texto\n");
        String cadena2 = System.console().readLine("Introduce cadena de texto\n");

        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas de texto son iguales\n");
        } else {
            System.out.println("Existen diferencias en las cadenas de texto\n");
        }

    }
}
