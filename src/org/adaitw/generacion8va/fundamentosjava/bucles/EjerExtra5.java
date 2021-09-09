package bucles;

//Vamos a plantear y resolver un ejercicio: queremos almacenar en una matriz el número de alumnos con
//        el que cuenta una academia, ordenados en función del nivel y del idioma que se estudia. Tendremos 3
//        filas que representarán al Nivel básico, medio y de perfeccionamiento y 4 columnas en las que figurarán
//        los idiomas (0 = Inglés, 1 = Francés, 2 = Alemán y 3 = Ruso). Se pide realizar la declaración de la matriz y
//        asignarle unos valores de ejemplo a cada elemento.

import java.util.Scanner;

public class Ej_extra_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int nroNiveles = 3, nroIdiomas = 4, alumnos, idioma, nivel;
        String[] idiomas = {"Inglés", "Francés", "Alemán", "Ruso"};
        String[] niveles = {"Básico", "Medio", "Perfeccionamiento"};
        int matriz[][] = new int[nroNiveles][nroIdiomas];

        System.out.println("Ingrese cantidad de alumnos: ");
        alumnos = read.nextInt();
        for (int i=0; i<alumnos; i++){
            int opcion = 1;
            while(opcion==1) {
                System.out.println("Alumno " + (i + 1) + ": \n Ingrese el idioma que estudia: \n 0 = Inglés \n 1 = " +
                        "Francés");
                System.out.println(" 2 = Alemán \n 3 = Ruso");
                idioma = read.nextInt();
                System.out.println("Ingrese su nivel \n 0 = Básico \n 1 = Medio \n 2 = Perfeccionamiento");
                nivel = read.nextInt();
                matriz[nivel][idioma]++;
                System.out.println("¿Desea agregar otro idioma para este alumno? 1- Sí, continuar. 2- No, salir.");
                opcion = read.nextInt();
            }
        }
        System.out.println("Conteo final de alumnos por idioma y nivel: ");
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroIdiomas; j++) {
                System.out.printf("Idioma: %s | Nivel: %s = %d.\n", idiomas[j], niveles[i], matriz[i][j]);
            }
        }
    }
}
