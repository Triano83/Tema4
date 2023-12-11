/**
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
 * del 1 al 25 y luego muestre la matriz por pantalla.
 * 
 * @author Jose Luis Triano Pavón
 */

public class ejercicio1 {
//Declaracion de variables y array
    public static void main(String[] args) {
        int[][] num = new int[5][5];

        int fila;
        int columna;
        int contador = 1;
//Introducimos  los numeros en el array
        for (fila = 0; fila < 5; fila++) {
            for (columna = 0; columna < 5; columna++) {
                num[fila][columna] = contador;
                contador++;
            }
        }
// Imprimimos el array dandole formato
        for (fila = 0; fila < 5; fila++) {
            System.out.println();
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%3d|", num[fila][columna]);

            }

        }

    }
}
