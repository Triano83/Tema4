public class Ejercicio4_3_4 {

    public static void main(String[] args) {
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        String frase = System.console().readLine("Introduce una frase\n");
        String newFrase = frase.toLowerCase();
        for (int i = 0; i < newFrase.length(); i++) {
            char vowels = newFrase.charAt(i);
            if (vowels == 'a') {
                contadorA++;
            } else if (vowels == 'e') {
                contadorE++;
            } else if (vowels == 'i') {
                contadorI++;
            } else if (vowels == 'o') {
                contadorO++;
            } else if (vowels == 'u') {
                contadorU++;
            } else {

            }
        }
        System.out.println("Numero de vocales");
        System.out.println("A: " + contadorA);
        System.out.println("E: " + contadorE);
        System.out.println("I: " + contadorI);
        System.out.println("O: " + contadorO);
        System.out.println("U: " + contadorU);
    }

}
