package ada.clase11;
import java.util.Scanner;
/*
Se requiere determinar la hipotenusa de un triángulo rectángulo.
 ¿Cómo sería el diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
 Recuerde que por Pitágoras se tiene que: C^2  = A^2  + B^2.
 */

public class Ejercicio6 {
    public static void main(String[] args){
        double cateto1, cateto2, hipotenusa;
        Scanner lector = new Scanner(System.in);

        System.out.println("************ Ejercicio 6 ************");
        System.out.println("Ingrese el valor del primer cateto: ");
        cateto1 = lector.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto: ");
        cateto2 = lector.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa del triángulo es " + hipotenusa);
    }
}

