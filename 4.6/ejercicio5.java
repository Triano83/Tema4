public class ejercicio5 {

    public static void main(String[] args) {

        System.out.print("Dime el número de personas ");
        int n = Integer.parseInt(System.console().readLine());
        int nvarones = 0, nmujeres = 0, sumavarones = 0, sumamujeres = 0;

        float sueldos[][] = new float[n][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (0 para varón y 1 para mujer) de la persona " + (i + 1) + ": ");
                    sueldos[i][j] = Integer.parseInt(System.console().readLine());
                }
                if (j == 1) {
                    System.out.print("Dime el sueldo: ");
                    sueldos[i][j] = Float.parseFloat(System.console().readLine());
                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                nvarones++;
                sumavarones += sueldos[i][1];
            }
            if (sueldos[i][0] == 1.0) {
                nmujeres++;
                sumamujeres += sueldos[i][1];
            }
        }
        System.out.println("El sueldo medio de los varones es: " + (sumavarones / nvarones));
        System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));
    }
}