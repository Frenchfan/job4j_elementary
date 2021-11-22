package ru.job4j.array;

import java.util.Arrays;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int[] preresult = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + count < nums.length) {
                preresult[i + count] = nums[i];
            } else {
                preresult[i + count - nums.length] = nums[i];
            }
        }
        System.arraycopy(preresult, 0, nums, 0, nums.length);
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int[] preresult = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                preresult[i + 1] = nums[i];
            } else {
                preresult[i + 1 - nums.length] = nums[i];
            }
        }
        System.arraycopy(preresult, 0, nums, 0, nums.length);
    }
}
