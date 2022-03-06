package com.exercise;

import org.jetbrains.annotations.NotNull;

public class EjercicioTema3 {

    public static void main(String[] args) {
        String[] names = {"Esteban", "Jonathan", "Damián", "Abel", "Eric"};

        printNamesListed(names);
    }

    static void printNamesListed(String @NotNull [] names) {
        String temp = "";
        String namesListed = "";
        for (String name : names) {
            temp = name + " ";
            namesListed += temp;
        }
        System.out.println(namesListed);
    }
}
