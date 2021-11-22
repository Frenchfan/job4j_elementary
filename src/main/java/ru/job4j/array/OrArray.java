package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] preresult = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            preresult[i] = left[i];
        }
        int counter = left.length;
        for (int i = 0; i < right.length; i++) {
            boolean toadd = true;
            for (int j = 0; j < counter; j++) {
                if (right[i] == preresult[j]) {
                    toadd = false;
                }
            }
            if (toadd) {
                preresult[counter] = right[i];
                counter++;
            }
        }
        return Arrays.copyOfRange(preresult, 0, counter);
    }
}
