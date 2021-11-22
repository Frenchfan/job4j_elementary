package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int counter = 0;
        int[] preresult = new int[Math.max(left.length, right.length)];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    preresult[counter] = left[i];
                    counter++;
                }
            }
        }
        int[] result;
        result = Arrays.copyOfRange(preresult, 0, counter);
        return result;
    }
}
