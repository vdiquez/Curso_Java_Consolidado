package guia03;

import java.util.Scanner;

public class Ejercicio19version2 {
// 19.	Realice un algoritmo que calcule el valor que se obtiene al
// multiplicar entre sí los elementos de la diagonal principal de una
// matriz de 5 por 5 elementos.

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int productoDiag = 1;

        // Carga de  matriz y obtener el producto
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println("Introduzca el valor de la fila " + i + " y columna " + j);
                matriz[i][j] = lector.nextInt();
                if (i==j) productoDiag *= matriz[i][i];
             }
        }
        lector.close();

        System.out.printf("El producto de la diagonal principal es %d.\n", productoDiag);

    }

}
