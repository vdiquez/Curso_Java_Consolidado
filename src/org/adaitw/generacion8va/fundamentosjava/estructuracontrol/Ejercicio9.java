package estructuras_de_control;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* 9. Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
        daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
        ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
        beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
        cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
        10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
        represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
        póliza.
         */
        Scanner lector = new Scanner(System.in);
        float COSTO_A = 1200, COSTO_B = 950, edad, costoEdad;
        String alcohol, lentes, enfermedad;
        float costoAlcohol, costoLentes, costoEnfermedad, costoFinal;

        System.out.println("Toma alcohol?");
        alcohol = lector.nextLine();
        if (alcohol == "si") {
            costoAlcohol = 0.10f;
        } else {
            costoAlcohol = 0;
        }

        System.out.println("Usa lentes?");
        lentes = lector.nextLine();
        if (lentes == "si") {
            costoLentes = 0.05f;
        } else {
            costoLentes = 0;
        }

        System.out.println("Padece deficiencia cardiaca o diabetes?");
        enfermedad = lector.nextLine();
        if (lentes == "si") {
            costoEnfermedad = 0.05f;
        } else {
            costoEnfermedad = 0;
        }

        System.out.println("Cuantos años tiene?");
        edad = lector.nextFloat();
        if (edad > 40) {
            costoEdad = 0.20f;
        } else {
            costoEdad = 0.10f;
        }

        System.out.println("¿Que plan utiliza?: ");
        String plan = lector.nextLine();

        costoFinal = 0;
        if (plan == "a") {
            costoFinal = COSTO_A + COSTO_A * (costoAlcohol + costoEnfermedad + costoLentes + costoEdad);

        } else if (plan == "b") {
            costoFinal = COSTO_B + COSTO_B * (costoAlcohol + costoEnfermedad + costoLentes + costoEdad);

        } else {
            System.out.println("No ingresó una opción válida");
        }

        System.out.println("El costo final de su poliza es de: " + costoFinal);

    }
}
