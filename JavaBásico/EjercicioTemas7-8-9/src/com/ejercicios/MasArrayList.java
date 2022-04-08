package com.ejercicios;

import java.util.ArrayList;

public class MasArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int count = 0;

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                numbers.add(count, i);
                System.out.println(numbers.get(count));
                count++;
            }
        }
    }
}
