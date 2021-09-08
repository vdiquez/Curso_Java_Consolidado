package estructuras_de_control;
//11. Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
//        les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
//        tengan más de 5, el bono será de $1000.
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        byte antiguedad;
        int bono;
        System.out.println("Ingrese la antiguedad del trabajador: ");
        antiguedad = read.nextByte();
        if (antiguedad <= 5){
            bono = antiguedad*100;
        } else {
            bono = 1000;
        }
        System.out.println("El bono percibido por el empleado es de $"+ bono);
    }
}
