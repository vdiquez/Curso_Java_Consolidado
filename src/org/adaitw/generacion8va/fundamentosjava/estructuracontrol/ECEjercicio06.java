package Clase18;

import java.util.Scanner;

public class ECEjercicio06 {
    public static void main(String[] args) {
        float precioDescuento;
        float descuento;
        System.out.println("Ingrese el precio del producto");
        Scanner lector = new Scanner(System.in);
        float costoProducto = lector.nextFloat();

        if (costoProducto >= 200) {
            descuento = 0.15f;
        } else if (costoProducto >= 100) {
            descuento = 0.12f;
        } else {
            descuento = 0.10f;
        }
        precioDescuento = costoProducto - (costoProducto*descuento);
        System.out.println("El valor con descuento es " + precioDescuento + " pesos");



    }

}
