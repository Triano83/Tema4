/**
 * Crear 2 arrays y copiar a la inversa los datos del primer array en el segundo
 * 
 * @author Jose Luis Triano Pavon
 */

public class Ejercicio4_4_11 {
    public static void main(String[] args) {
        // Declaración
        int[] arrayEntero1 = new int[100];
        int[] arrayEntero2 = new int[100];
        int contador = 0;
        // Ingresos de datos 1er Array
        for (int i = 0; i < arrayEntero1.length; i++) {
            arrayEntero1[i] = i + 1;
        }
        // Ingreso de datos del segundo array del revés
        for (int i = arrayEntero1.length - 1; i >= 0; i--) {
            arrayEntero2[contador] = arrayEntero1[i];
            contador++;
        }
        // Mostrar por pantalla
        for (int i = 0; i < arrayEntero1.length; i++) {
            System.out.println("-----------------");
            System.out.println("Posicion:" + i);
            System.out.println(arrayEntero1[i]);
            System.out.println(arrayEntero2[i]);
            System.out.println("-----------------");
        }
    }
}
