/**
 * Introducir diferentes alturas en un array y hacer varias operaciones
 * 
 * @author Jose Luis Triano Pavon
 */

public class Ejercicio4_4_10 {
    public static void main(String[] args) {
        // variables
        float suma = 0;
        float media = 0;
        int contador = 0;
        int nAlturas = 0;
        boolean esVerdad = true;

        do {
            try {
                nAlturas = Integer.parseInt(System.console().readLine("Introduce un numero\n"));
                esVerdad = true;
            } catch (Exception e) {
                System.out.println("Introduce un numero entero");
                esVerdad = false;
            }
        } while (!esVerdad);

        float[] arrayAlturas = new float[nAlturas];
        System.out.println();

        // Almacena las alturas en el array
        for (int i = 0; i < nAlturas; i++) {
            do {
                try {
                    arrayAlturas[i] = Float.parseFloat(System.console().readLine("Introduce una altura en metros\n"));
                    esVerdad = true;
                } catch (Exception e) {
                    System.out.println("Introduce una altura en metros");
                    esVerdad = false;
                }
            } while (!esVerdad);
        }
        System.out.println();
        // Nos muestra las alturas introducidas y las suma todas.
        for (int i = 0; i < arrayAlturas.length; i++) {
            System.out.println("Resultado " + (i + 1) + "->" + arrayAlturas[i]);
            suma = suma + arrayAlturas[i];
        }
        media = suma / nAlturas;
        System.out.printf("La media de las alturas es: %.2f\n", media);
        System.out.println();

        // Compara los numeros almacenados en el array y muestra el mayor
        float mayor = arrayAlturas[0];
        for (int i = 1; i < arrayAlturas.length; i++) {

            if (arrayAlturas[i] > mayor) {
                mayor = arrayAlturas[i];
            }
        }
        System.out.println("La altura mayor es: " + mayor);
        System.out.println();

        // Compara los numeros almacenados en el array y muestra el menor
        float menor = arrayAlturas[0];
        for (int i = 1; i < arrayAlturas.length; i++) {

            if (arrayAlturas[i] < menor) {
                menor = arrayAlturas[i];
            }
        }
        System.out.println("La altura mayor es: " + menor);
        System.out.println();

        // lanza por pantalla cuantas alturas hay superiores a la media
        for (int i = 0; i < arrayAlturas.length; i++) {
            if (media < arrayAlturas[i]) {
                contador++;
            }
        }
        System.out.println("En este array constan " + contador + " alturas por encima de la media");
        System.out.println();
    }
}
