package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[2 + middle.length / 2 + right.length / 2];
        result[0] = left[0];
        for (int i = 1; i < middle.length; i += 2) {
            result[i + 1] = middle[i];
        }
        for (int i = 0; i < right.length; i += 2) {
            result[i + 1] = right[i];
        }
        result[result.length - 1] = left[left.length - 1];
        return result;
    }
}