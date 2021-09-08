package Clase21;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        int fil = 5, col = 4;
       Scanner lector = new Scanner(System.in);
        int[][] matriz = new int[fil][col];

        // Carga de datos
        System.out.println("Cargue el arreglo de " + fil + " por " + col);
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = lector.nextInt();
            }
        }

        // Numero menor de la matriz
        int menorNro = matriz[0][0];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] < menorNro) {
                    menorNro = matriz[i][j];
                }
            }
        }

        // Suma de una porción de la matriz
        int sumatoria = 0;
        int limiteFilaSumatoria = 2;

        for (int i = 0; i < limiteFilaSumatoria; i++) {
            for (int j = 0; j < col; j++) {
                sumatoria += matriz[i][j];
            }
        }

        // Numeros negativos
        int cantNegativos=0;
        int limiteInferiorColNeg = 2, limiteSuperiorColNeg = 5;
        for (int i=0; i<fil; i++){
            for (int j=limiteInferiorColNeg; j<limiteSuperiorColNeg-1; j++){
                if(matriz[i][j]<0){
                    cantNegativos++;
                }
            }
        }

        System.out.println("El menor número encontrado en la matriz fue " + menorNro);
        System.out.println("La suma total de las " + limiteFilaSumatoria + " primeras filas es " + sumatoria);
        System.out.println("La cantidad de numero negativos de las columnas de la " + (limiteInferiorColNeg+1) + " a la " + limiteSuperiorColNeg + " es "+ cantNegativos);

    }
}
