package com.ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList {

    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<String>();

        elements.add("First element.");
        elements.add("Second element.");
        elements.add("Third element.");
        elements.add("Fourth element.");

        LinkedList<String> linkedElements = new LinkedList<String>(elements);

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("ArrayList Element: " + elements.get(i));
            System.out.println("LinkedList Element: " + linkedElements.get(i));
        }
    }
}
