package clases.ada.clase11;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("***Ejercicio2***");
        Scanner lector = new Scanner(System.in);
        double dolarEnArgentina, cantPesosArgentinos, totalDolares;
        System.out.print("Introduzca el precio del dólar hoy= ");
        dolarEnArgentina = lector.nextDouble();
        System.out.print("Introduzca la cantidad de ARS que desea canjear= ");
        cantPesosArgentinos = lector.nextDouble();
        totalDolares = cantPesosArgentinos / dolarEnArgentina;
        System.out.println("La cantidad de dolares a recibir es de: " + totalDolares);


    }
}
