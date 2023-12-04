/**
 * Hacer un array de 100 espacios he introducir 100 numeros aleatorios luego
 * pedirá por teclado un numero y dira cuantas coincidencias existen en el
 * array.
 * 
 * @author Jose Luis Triano Pavón
 */
public class Ejercicio4_4_9 {
    public static void main(String[] args) {

        int contador = 0;
        boolean esVerdadero = true;
        int num = 0;
        int[] array100 = new int[100];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10) + 1;
            array100[i] = random;
            System.out.println(random);
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
                contador++;
            }
        }
        String vezVeces = contador == 1 ? " vez" : " veces";
        System.out.println("El numero se ha repetido dentro del array: " + contador + vezVeces);
    }
}
