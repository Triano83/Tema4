/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente
 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
 * introducir 10 diez veces, y luego la muestre por pantalla.
 * 
 * @author Jose Luis Triano Pavón
 */

public class Ejercicio4_4_14 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 10; i > 0; i--) {
            suma = suma + i;
        }

        int[] array = new int[suma];

    }
}
