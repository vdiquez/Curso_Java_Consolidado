package bucles;

//18. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella
//        genere dos vectores que contengan la suma de sus renglones y la suma de sus
//        columnas.

import java.util.Arrays;
import java.util.Scanner;

public class Ej_18 {
    public static void main(String[] args) {

        int col = 0, filas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        col = sc.nextInt();

        int[][] matriz = new int[filas][col];
        int[] sumacol = new int[col];
        int[] sumafilas = new int[filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Ingrese para la fila %d y columna %d \n", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < filas; i++) {
                sumacol[j] += matriz[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumacol[j]);
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                sumafilas[i] += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumafilas[i]);
        }

        System.out.println("Los vectores con las sumas de las filas y columnas quedarían: ");
        System.out.println("sumacol = " + Arrays.toString(sumacol));
        System.out.println("sumafilas = " + Arrays.toString(sumafilas));
    }


}

