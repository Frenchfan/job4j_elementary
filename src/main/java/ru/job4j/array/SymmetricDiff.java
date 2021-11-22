package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int counter = 0;
        int[] preresult = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            boolean toadd = true;
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    toadd = false;
                }
            }
            if (toadd) {
                preresult[counter] = left[i];
                counter++;
            }
        }
        for (int i = 0; i < right.length; i++) {
            boolean toadd = true;
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
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
