package bucles;

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese num de filas y columnas: ");
        int m = read.nextInt();
        int matriz[][] = new int[m][m];
        String mensaje = "Es una matriz diagonal";
        outerloop:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Ingrese el valor en (%d, %d): ", i, j);
                matriz[i][j] = read.nextInt();
                if (i != j && matriz[i][j] != 0 || i == j && matriz[i][j] == 0) {
                    mensaje = "No es una matriz diagonal";
                    break outerloop;
                }
            }
        }
        System.out.println("Resultado: " + mensaje);
    }
}
