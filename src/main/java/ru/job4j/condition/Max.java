package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean leftmore = left > right;
        int result = leftmore ? left : right;
        return result;
    }
}
