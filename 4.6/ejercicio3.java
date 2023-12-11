/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
 * teclado) e introduzca en ella NxM valores (también introducidos por teclado).
 * Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos
 * valores son mayores que cero, cuántos son menores que cero y cuántos son
 * igual a cero.
 * 
 * @author Jose Luis Triano Pavón
 */

public class ejercicio3 {
    public static void main(String[] args) {
//Declaracion de variables        
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        int fila;
        int columna;
        int filaI;
        int columnaJ;

        fila = Integer.parseInt(System.console().readLine("Introduce un numero de filas\n"));
        columna = Integer.parseInt(System.console().readLine("Introduce un numero de columnas\n"));

        int[][] array = new int[fila][columna];
//INtroduce los numeros en las posiciones del Array
        for (filaI = 0; filaI < fila; filaI++) {
            for (columnaJ = 0; columnaJ < columna; columnaJ++) {
                array[filaI][columnaJ] = Integer
                        .parseInt(System.console().readLine("Introduce un valor para esta posicion\n"));
            }
        }
// Usando los bucles aumentamos los contadores haciendo comparaciónes 
        for (filaI = 0; filaI < fila; filaI++) {
            System.out.println();
            for (columnaJ = 0; columnaJ < columna; columnaJ++) {
                System.out.printf("%3d  |", array[filaI][columnaJ]);
                if (array[filaI][columnaJ] == 0) {
                    igual++;

                } else if (array[filaI][columnaJ] > 0) {
                    mayor++;
                } else {
                    menor++;
                }

            }
        }
        System.out.println();
        System.out.println("En este array de 2D hay: ");
        System.out.println(mayor + " valores mayores a 0");
        System.out.println(menor + " valores menores a 0");
        System.out.println(igual + " valores iguales a 0");
    }
}
