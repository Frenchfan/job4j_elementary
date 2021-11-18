package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = data[dst];
        data[dst] = data[src];
        data[src] = temp;
    }
}
