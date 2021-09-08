package clase.ada.guia3Bucles;

import java.util.Scanner;

public class Ejercicio1 {
          /*
        1.	Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz
        transpuesta de cualquier matriz de orden M x N.
         */
        public static void main(String[] args) {
            Scanner escaner = new Scanner(System.in);
            System.out.println("Cuántas filas tiene tu matriz?: ");
            int filas = escaner.nextInt();
            System.out.println("Cuántas columnas tiene tu matriz?: ");
            int columnas = escaner.nextInt();

            int matriz[][] = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.println("Introduzca el valor de la fila " + i + " y columna " + j);
                    matriz[i][j] = escaner.nextInt();
                }
            }
            System.out.println("La matriz original es: ");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }

            System.out.println("La matriz transpuesta es: ");
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    System.out.print(matriz[j][i]);
                }
                System.out.println("");
            }
        }
    }
