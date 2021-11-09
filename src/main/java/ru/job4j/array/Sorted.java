package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
                return false;
            }
            temp = array[i];
        }
        return true;
    }
}
