package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] result = new int[data.length];
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            result[counter] = data[i][data.length - 1 - i];
            counter++;
        }
        return result;
    }
}
