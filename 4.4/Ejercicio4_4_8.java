/**
 * Hacer un array de 100 espacios he introducir 100 numeros aleatorios entre 0.0
 * y 1.0
 * luego preguntar un numero entre ese rango y decir cuantas coincidencias hay y
 * cuantos
 * numeros mayores
 * 
 * @author Jose Luis Triano Pavón
 */

public class Ejercicio4_4_8 {

    public static void main(String[] args) {
        float[] array100 = new float[100];
        int contadorAciertos = 0;
        int contadorSuperior = 0;
        for (int i = 0; i < 100; i++) {
            float random = (float) Math.random();
            array100[i] = random;
        }

        float numero = Float.parseFloat(System.console().readLine("Introduce un numero real entre 0.0 y 1.0\n"));

        for (int i = 0; i < 100; i++) {
            if (numero == array100[i]) {
                contadorAciertos++;
            } else if (numero < array100[i]) {
                contadorSuperior++;
            }
        }
        System.out.println("El numero de aciertos es: " + contadorAciertos);
        System.out.println("El numero de numeros superiores al introducido es: " + contadorSuperior);
    }
}