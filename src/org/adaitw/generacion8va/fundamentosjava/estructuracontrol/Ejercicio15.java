package estructuras_de_control;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        byte num = keyboard.nextByte();
        String dia;
        switch (num) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("No se ingresó un día válido");
                dia = "inexistente";
                break;
        }

        System.out.printf("El día de la semana que le corresponde al número %d es %s.", num, dia);
    }
}
