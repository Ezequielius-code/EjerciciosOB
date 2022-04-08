package com.ejercicios;

public class ArrayBidimensional {

    public static void main(String[] args) {
        int[][] matrixArray = { {4, 8, 16, 32, 64}, {100, 1000, 10000, 100000, 1000000} };

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.println("■Row index: " + i + " ■Column index: " + j + " ■Value: " + matrixArray[i][j]);
            }
        }
    }
}
