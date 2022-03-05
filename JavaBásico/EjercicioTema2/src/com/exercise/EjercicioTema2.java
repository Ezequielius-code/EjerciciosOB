package com.exercise;

public class EjercicioTema2 {

    public static void main(String[] args) {
        float price = 129.99f;

        float finalPrice = priceWithVAT(price);
        System.out.println("The final price is: \u20ac " + String.format("%.2f",finalPrice) + ".-");
    }

    static float priceWithVAT(float grossPrice) {
        float finalPrice = grossPrice * 1.21f;
        return finalPrice;
    }
}