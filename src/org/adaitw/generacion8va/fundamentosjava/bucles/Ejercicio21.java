package FundamentosJava.clase19;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        double pagoMinimoAnterior, interesAcumulado, multaPorPagoMenoralMinimo;
        double saldoActual, pagoMinimoActual, pagoParaNoGenerarIntereses;
        System.out.println("Introduzca el valor del saldo anterior del cliente:");
        double saldoAnterior = lector.nextDouble();
        System.out.println("Introduzca el monto total de las compras que realizó:");
        double montoTotalComprasRealizadas = lector.nextDouble();
        System.out.println("Introduzca el valor del pago que realizó en el corte anterior:");
        double pagoCorteAnterior = lector.nextDouble();

        pagoMinimoAnterior = saldoAnterior * 0.15;

        if (pagoCorteAnterior > pagoMinimoAnterior) {
            interesAcumulado = 0;
            multaPorPagoMenoralMinimo = 0;
        } else {
            interesAcumulado = saldoAnterior * 0.12;
            multaPorPagoMenoralMinimo = 200;
        }
        saldoActual = saldoAnterior + montoTotalComprasRealizadas + interesAcumulado + multaPorPagoMenoralMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * 0.15;
        pagoParaNoGenerarIntereses = saldoActual * 0.85;

        System.out.println("Valor de pago mínimo: " + pagoMinimoActual);
        System.out.println("Valor de pago para no generar intereses: " + pagoParaNoGenerarIntereses);
        System.out.println("Valor de saldo actual: " + saldoActual);
    }
}
