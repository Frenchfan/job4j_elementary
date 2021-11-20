package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] result = new int[size][size];
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (counter < array.length) {
                    result[i][j] = array[counter];
                } else {
                    result[i][j] = 0;
                }
                counter++;
            }
        }
        return result;
    }
}