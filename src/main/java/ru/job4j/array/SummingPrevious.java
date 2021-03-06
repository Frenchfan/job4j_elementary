package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        for (int i = 2; i < result.length; i++) {
            int sumprev = 0;
            for (int j = 0; j < i; j++) {
               sumprev += result[j];
            }
            result[i] = sumprev;
        }
        return result;
    }
}
