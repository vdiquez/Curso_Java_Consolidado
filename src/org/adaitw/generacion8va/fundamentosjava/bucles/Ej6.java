package bucles;

import java.util.Scanner;

//6. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
//        los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
//        vectores, y con base en esto se determine el nombre del alumno con la edad mayor del
//        arreglo.

public class Ej_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final int LONGITUD = 10;
        String nombres[] = new String[LONGITUD];
        int edades[] = new int[LONGITUD];

        int mayorEdad = 0;
        int indice = 0;
        for (int i = 0; i < LONGITUD; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            nombres[i] = read.nextLine();
            System.out.println("Ingrese la edad del alumno " + (i + 1) + ":");
            edades[i] = read.nextInt();
            //Tuve que poner la siguiente linea porque sino no me leia el String en la siguiente vuelta del bucle.
            read.nextLine();
            // Evalúo en el if si el numero que ingresamos en edad es el mayor. Lo compara con el valor anterior
            // guardado en la variable mayorEdad. Si es mayor, se guarda este nuevo valor y a su vez se guarda su
            // indice (i).

            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];
                indice = i;
            }
        }
        //Buscamos el indice guardado en el condicional anterior para saber como se llama el alumno de mayor edad.
        System.out.println("El alumno de mayor edad es " + nombres[indice]);

    }


}
