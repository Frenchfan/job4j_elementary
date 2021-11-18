package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[src].length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapCols.swap(data, 0, 2);
    }
}

