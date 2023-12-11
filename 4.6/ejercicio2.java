/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las
 * tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la
 * matriz por pantalla.
 * 
 * @author Jose Luis Triano Pavón
 */

public class ejercicio2 {
    public static void main(String[] args) {

//Declaracion de variables
        int fila;
        int columna;
        int[][] multiplicar = new int[10][10];
        
// Introduzco los resultados de las tablas de multiplicar dentro del array
        for (fila = 0; fila < 10; fila++) {
            for (columna = 0; columna < 10; columna++) {
                multiplicar[fila][columna] = (fila + 1) * (columna + 1);
            }
        }
// Uso los bucles for para ir imprimiendo
        for (fila = 0; fila < 10; fila++) {
            System.out.println();
            for (columna = 0; columna < 10; columna++) {
                System.out.printf((fila + 1) + " X " + (columna + 1) + " = " + multiplicar[fila][columna]);

            }
        }

    }
}
