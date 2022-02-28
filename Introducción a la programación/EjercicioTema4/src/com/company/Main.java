package com.company;

public class Main {

    public static void main(String[] args) {
	    //Uso de if
        short numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else if (numeroIf == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es positivo.");
        }

        //Bucle while

        short numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Bucle Do While

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        //Bucle for

        for (short numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Sentencia switch

        String estacion = "Verano";

        switch (estacion) {
            case "Otoño":
                System.out.println("Es otoño.");
                break;
            case "Invierno":
                System.out.println("Es invierno.");
                break;
            case "Primavera":
                System.out.println("Es primavera.");
                break;
            case "Verano":
                System.out.println("Es verano.");
                break;
        }
    }
}
