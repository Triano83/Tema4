/**
 * Crear un menú donde podamos agregar valores a un array, mostrar valores,
 * o salir
 * 
 * @author Jose Luis Triano Pavón
 */

public class Ejercicio4_4_12 {
    public static void main(String[] args) {
        int[] enteros = new int[100];
        int[] array = null;
        char opcion;
        System.out.println("**************************");
        System.out.println("            Menú: ");
        System.out.println("Opcion a) Mostrar Valores");
        System.out.println("Opcion b) Introducir Valores");
        System.out.println("Opcion c) Salir");
        System.out.println("**************************");

        do {
            opcion = System.console().readLine("Introduce una Opcion\n").toLowerCase().charAt(0);
            switch (opcion) {
                case 'a':

                    for (int i = 0; i < enteros.length; i++) {
                        if (array[i] != 0) {
                            System.out.println("En la posicion " + i + " se encuentra el valor: " + array[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 'b':
                    int posicion = Integer.parseInt(System.console().readLine("Introduce la posición: "));
                    int valor = Integer.parseInt(System.console().readLine("Introduce el valor: "));
                    enteros[posicion] = valor;
                    System.out.println();
                    break;
                case 'c':
                    System.out.println("Adios\n");
                    System.out.println();
                    break;

                default:
                    System.out.println("Introduce \"a\",\"b\" o \"c\"");
                    break;
            }

        } while (opcion != 'c');
    }
}
