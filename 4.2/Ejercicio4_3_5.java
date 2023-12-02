/**
 * Averiguar ni una frase es palindroma o no
 * 
 * @author Jose Luis Triano
 */

public class Ejercicio4_3_5 {
    public static void main(String[] args) {
        String frase = System.console().readLine("Introduce una frase\n").toLowerCase();
        // He introducido el string de la frase en un array sin los espacios
        String[] arrayFrase1 = frase.split(" ");
        String nuevaFrase1 = "";
        // Frase 1 Quito espacio entre cada palabra y la almaceno en un String
        for (int i = 0; i < arrayFrase1.length; i++) {

            nuevaFrase1 = nuevaFrase1 + arrayFrase1[i].trim();
        }

        String nuevaFrase2 = "";

        // Frase 2 Le he dado la vuelta a toda la frase
        for (int i = nuevaFrase1.length() - 1; i >= 0; i--) {

            nuevaFrase2 = nuevaFrase2 + nuevaFrase1.charAt(i);

        }

        if (nuevaFrase1.equals(nuevaFrase2)) {

            System.out.println("Esta frase es palindroma");

        } else {
            System.out.println("Esta frase no es palindroma");
        }

    }

}
