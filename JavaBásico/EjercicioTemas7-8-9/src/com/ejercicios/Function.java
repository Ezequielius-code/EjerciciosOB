package com.ejercicios;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredText;

        System.out.println("Enter text: ");
        enteredText = scanner.nextLine();

        System.out.println("Input text: " + enteredText);
        System.out.println("Reversed input: " + reverse(enteredText));
    }

    public static String reverse(String texto) {
        String reversedText = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversedText = reversedText + texto.charAt(i);
        }
        return reversedText;
    }
}

/*TODO
Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y
"fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro
"fileIn" al fichero dado en "fileOut".

Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
excepciones, un HashMap y un ArrayList, LinkedList o array.
 */