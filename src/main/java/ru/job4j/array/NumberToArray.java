package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        String digit = String.valueOf(number);
        int[] result = new int[digit.length()];
        for (int i = 0; i < digit.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(digit.charAt(digit.length() - 1 - i)));
        }
        return result;
    }
}
