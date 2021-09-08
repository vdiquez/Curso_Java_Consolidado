package clases;

import java.util.Scanner;

// 11. La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
//persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW).
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double consumo, precioPorKW, pagoTotal;
        System.out.println("Ingrese su consumo en KW");
        consumo = keyboard.nextDouble();
        System.out.println("Ingrese el precio por KW");
        precioPorKW = keyboard.nextDouble();
        pagoTotal = consumo * precioPorKW;
        System.out.printf("El pago total a realizar es de $%.2f\n", pagoTotal);
    }
}
