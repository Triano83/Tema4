public class Ejercicio4_4_13 {
    public static void main(String[] args) {
        //Variable
        int num=0;
        int i=0;
        int nDatos=0;

        //Ingresar datos
        nDatos=Integer.parseInt(System.console().readLine("Introduce numero de valores a crear\n"));
        num=Integer.parseInt(System.console().readLine("Introduce el numero para almacenar en el primer lugar del array\n"));
        i=Integer.parseInt(System.console().readLine("Introduce el incremento\n"));
        System.out.println();

        int [] array = new int[nDatos];

        for(int j = 0;j<array.length;j++){
            
            array[j]=num;
            num=num+i;

        }

        for(int j = 0;j<array.length;j++){
            System.out.println(array[j]);
        }
        

    }
}
