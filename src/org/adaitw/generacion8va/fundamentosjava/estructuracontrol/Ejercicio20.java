package estructuras_de_control;
//20. Realice un algoritmo para resolver el siguiente problema: una fábrica de pantalones
//        desea calcular cuál es el precio final de venta y cuánto ganará por los N pantalones que
//        produzca con el corte de alguno de sus modelos, para esto se cuenta con la siguiente
//        información:
//        a. Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
//        b. Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
//        c. Al modelo A se le carga 80 % del costo de la tela, por mano de obra. Al modelo B
//        se le carga 95 % del costo de la tela, por el mismo concepto.
//        d. A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra y tela,
//        sin importar el modelo.
//        e. Cuando se realiza el corte para fabricar una prenda sólo se hace de un solo
//        modelo y una sola talla.
//        f. Finalmente, a la suma de estos costos se les carga 30%, que representa la
//        ganancia extra de la tienda.

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float precioFinal, metrosTela = 0, costoTotalTela, costoManoObra, ganancia, extraPorTalle = 0,
        porcentajeManoObra = 0, subtotal;

        System.out.println("Modelo (A o B): ");
        String modelo = lector.nextLine();
        System.out.println("Talle (30, 32 y 36): ");
        byte talle =  lector.nextByte();
        System.out.println("Cantidad de pantalones: ");
        int cantPantalones = lector.nextInt();
        System.out.println("Precio por metro: ");
        float precioTela = lector.nextFloat();

        switch (modelo.toLowerCase()) {
            case "a":
                metrosTela = 1.50f;
                porcentajeManoObra = .8f;
                break;
            case "b":
                metrosTela = 1.80f;
                porcentajeManoObra = .95f;
                break;
        }
        costoTotalTela = metrosTela * precioTela * cantPantalones;
        costoManoObra = costoTotalTela * porcentajeManoObra;
        subtotal = costoTotalTela + costoManoObra;

        switch (talle){
            case 32:
            case 36:
                extraPorTalle = subtotal * .04f;
        }

        ganancia =  (subtotal + extraPorTalle) * .3f;
        precioFinal = subtotal + ganancia + extraPorTalle;

        System.out.printf("Costo de Tela = $%.2f\n", costoTotalTela);
        System.out.printf("Costo de Mano de Obra = $%.2f\n", costoManoObra);
        System.out.printf("Extra por talle = $%.2f\n", extraPorTalle);
        System.out.printf("Ganancia = $%.2f\n", ganancia);
        System.out.println("------------------------------------------------");
        System.out.printf("Total = $%.2f\n", precioFinal);

    }

}
