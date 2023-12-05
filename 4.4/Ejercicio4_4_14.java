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
        // averiguamos el tamaño del array
        for (int i = 10; i > 0; i--) {
            suma = suma + i;
        }
        // definimos el array con su tamaño correspondiente
        int[] array = new int[suma];
        int contador = 0;
        // 2 bucles para ir introduciendo los valores en el indice indicado
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[contador] = i;
                contador++;
            }
        }
        // mostramos los resultados
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
