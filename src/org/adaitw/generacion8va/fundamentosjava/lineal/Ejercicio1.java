package clases.ada.clase11;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        /* Realice un diagrama de flujo y pseudocódigo que representen el
        algoritmo para obtener el área de un triángulo.
         */

    float base, altura, areaTotal;
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese base del triangulo:");
        base = lector.nextFloat();
        System.out.println("Ingrese altura del triangulo:");
        altura = lector.nextFloat();
        areaTotal = base * altura / 2;
        System.out.printf("El area del triangulo es %.2f", areaTotal);





    }
}
