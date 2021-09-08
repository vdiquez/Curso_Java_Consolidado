package bucles;

import java.util.Scanner;

//13. Realice un algoritmo que lea un vector de cien elementos y que calcule su magnitud y
//        represéntelo mediante diagrama de flujo y pseudocódigo.
public class Ej_13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int TAMAÑO = 100;
        int vector[] = new int[TAMAÑO];
        int sum = 0;
        // Por lo que vi la magnitud de un vector se calcula haciendo la raiz de la suma de cada uno de los elementos
        // al cuadrado. Ej: en un vector=[8, 4, 5] sacariamos la magnitud con √ 8^2 + 4^2 + 5^2
        for (int i=0; i<TAMAÑO; i++){
            //Lleno el vector
            System.out.println("Ingrese el valor en la posición " + i + " del vector");
            vector[i] = read.nextInt();
            // Con Math.pow() hago la potencia cuadrada del valor que acabamos de ingresar y a su vez en cada vuelta
            // del bucle los voy sumando a todos en la variable sum.
            sum += Math.pow(vector[i], 2);
        }
        // Cuando ya tengo la suma de todos, finalizado el bucle, hago la raiz con Math.sqrt()
        double magnitud = Math.sqrt(sum);
        System.out.println("El valor de la magnitud del vector es igual a " + magnitud);
    }
}
