/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
 * valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
 * pedirá un valor N y mostrará en qué posiciones del array aparece N.
 * 
 * @author Jose Luis Triano Pavón
 */
public class Ejercicio4_4_9 {
    public static void main(String[] args) {

        boolean esVerdadero = true;
        int num = 0;
        int[] array100 = new int[100];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10) + 1;
            array100[i] = random;
        }

        System.out.println("Introduce un numero del 1 al 100");
        do {
            try {
                num = Integer.parseInt(System.console().readLine());
                esVerdadero = true;
            } catch (Exception e) {

                System.out.println("Introduce un numero entre el 1 y el 100");
                esVerdadero = false;
            }
        } while (!esVerdadero);

        for (int i = 0; i < 100; i++) {
            if (num == array100[i]) {
                System.out.println("Tu numero coincide en la posicion: " + i);
            }
        }
    }
}
