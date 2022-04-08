package com.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
    //del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    //Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente,
    //mostraremos en cualquier caso: "Demo de código".
    public static void main(String[] args) {
        int dividend = 0;
        int divisor = 0;
        int quotient;
        boolean numbersOk;

        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the dividend: ");
                dividend = scanner.nextInt();
                numbersOk = true;
            } catch (InputMismatchException e)
            {
                System.out.println("ERROR. Invalid input.");
                numbersOk = false;
            }
        } while (!numbersOk);

        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the divisor: ");
                divisor = scanner.nextInt();
                numbersOk = true;
            } catch (InputMismatchException e)
            {
                System.out.println("ERROR. Invalid input.");
                numbersOk = false;
            }
        } while (!numbersOk);

        try {
            quotient = DividePorCero(dividend, divisor);
            System.out.println(dividend + " divided by " + divisor + " is equal to: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("This cannot be done.");
        } finally {
            System.out.println("Demo Code");
        }
    }

    public static int DividePorCero (int dividend, int divisor) throws ArithmeticException {
        int quotient;
        try {
            quotient = dividend / divisor;
        } catch (ArithmeticException e) {
            throw e;
        }
        return quotient;
    }
}
