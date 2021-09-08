package clases;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // V: voltaje (v), I: intensidad (A), P: potencia (W), R: resistencia (ohm)
        final int R = 4;
        double voltaje, intensidad, potencia;
        System.out.println("Ingrese la intensidad (I):");
        intensidad = keyboard.nextDouble();
        voltaje = R * intensidad;
        potencia = voltaje * intensidad;
        System.out.printf("La potencia del circuito es de %.2f.\n", potencia);
    }
}
