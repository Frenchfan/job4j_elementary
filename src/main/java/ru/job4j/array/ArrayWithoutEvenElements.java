package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                result[counter] = data[i];
                counter++;
            }
        }
        return result;
    }
}