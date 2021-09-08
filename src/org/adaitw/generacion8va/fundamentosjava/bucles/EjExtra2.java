package bucles;
//2 - Crea un array bidimensional de números enteros y lo rellena con valores aleatorios dentro de un rango. Por ejemplo, generaArrayBiInt(8, 7, 10, 30) devolvería un array de 8 filas por 7 columnas relleno con números generados al azar comprendidos entre 10 y 30.

import java.util.Scanner;

public class Ej_extra_2 {
    public static void main(String[] args) {
        int filas, columnas, minimo=0, maximo=0;
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        filas = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columnas = read.nextInt();
        System.out.println("Ingrese el número límite máximo: ");
        maximo = read.nextInt();
        System.out.println("Ingrese el número límite mínimo: ");
        minimo = read.nextInt();

        while(maximo<minimo) {
                System.out.println("El número mínimo no puede ser mayor que el máximo. Ingrese los números nuevamente");
                System.out.println("Ingrese el número límite máximo: ");
                maximo = read.nextInt();
                System.out.println("Ingrese el número límite mínimo: ");
                minimo = read.nextInt();
        }


        int matriz[][] = new int[filas][columnas];


        System.out.println("La matriz queda como: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            matriz[i][j] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
                System.out.print("|" + matriz[i][j] + "|" );
            }
            System.out.println();
        }

    }
}
