package estructuras_de_control;


//13. Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren
//        determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son
//        las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,
//        $35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno.

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cantAlumnos;
        byte valorEntrada;
        System.out.println("Ingrese la cantidad de alumnos que realizarán el viaje: ");
        cantAlumnos = read.nextInt();

        if (cantAlumnos > 100) {
            valorEntrada = 20;
        } else if (cantAlumnos >= 50) {
            valorEntrada = 35;
        } else if (cantAlumnos >= 20) {
            valorEntrada = 35;
        } else {
            valorEntrada = 70;
        }

        System.out.printf("El valor a pagar por cada alumno es de $%d y el precio total del viaje es de $%d.",
                valorEntrada, cantAlumnos*valorEntrada);
    }
}
