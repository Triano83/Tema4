/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
 * notas por teclado y luego el programa mostrará la nota mínima, máxima y media
 * de cada alumno.
 * 
 * @author Jose Luis Triano Pavón
 */

public class ejercicio4 {
    public static void main(String[] args) {

        int[][] notas = new int[4][5];
        int[] suma = new int[4];
        int sumatoria = 0;
        int i, j;
        int mayor1 = 0, mayor2 = 0, mayor3 = 0, mayor4 = 0, menor1 = 10, menor2 = 10, menor3 = 10, menor4 = 10;

        // Introduzco todos los resultados de los examenes
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                notas[i][j] = Integer.parseInt(System.console()
                        .readLine("\nIntroduce la nota del examen nº: " + (j + 1) + " para el alumno: " + (i + 1)
                                + "\n"));

            }
        }

        // Saco el menor y el mayor de cada array individual
        for (i = 0; i < 4; i++) {
            System.out.println();
            for (j = 0; j < 5; j++) {
                System.out.printf("%3d", notas[i][j]);
                if (notas[0][j] > mayor1) {
                    mayor1 = notas[0][j];
                }
                if (notas[1][j] > mayor2) {
                    mayor2 = notas[1][j];
                }
                if (notas[2][j] > mayor3) {
                    mayor1 = notas[2][j];
                }
                if (notas[3][j] > mayor4) {
                    mayor4 = notas[3][j];
                }
                if (notas[0][j] < menor1) {
                    menor1 = notas[0][j];
                }
                if (notas[1][j] < menor2) {
                    menor2 = notas[1][j];
                }
                if (notas[2][j] < menor3) {
                    menor3 = notas[2][j];
                }
                if (notas[3][j] < menor4) {
                    menor4 = notas[3][j];
                }

            }

        }
        // He creado un array para almacenar la suma total de las notas de cada alumno
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                sumatoria = sumatoria + notas[i][j];
                suma[i] = sumatoria;
            }
            sumatoria = 0;
        }

        System.out.println();
        System.out.println("La mayor nota del Alumno 1 es: " + mayor1);
        System.out.println("La menor nota del Alumno 1 es: " + menor1);
        System.out.println("La media de notas del Alumno 1 es: " + (suma[0] / 5));
        System.out.println("La mayor nota del Alumno 2 es: " + mayor2);
        System.out.println("La menor nota del Alumno 2 es: " + menor2);
        System.out.println("La media de notas del Alumno 2 es: " + (suma[1] / 5));
        System.out.println("La mayor nota del Alumno 3 es: " + mayor3);
        System.out.println("La menor nota del Alumno 3 es: " + menor3);
        System.out.println("La media de notas del Alumno 3 es: " + (suma[2] / 5));
        System.out.println("La mayor nota del Alumno 4 es: " + mayor4);
        System.out.println("La menor nota del Alumno 4 es: " + menor4);
        System.out.println("La media de notas del Alumno 4 es: " + (suma[3] / 5));
    }
}
