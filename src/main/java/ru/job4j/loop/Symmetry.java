package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String digit = String.valueOf(i);
        int b = digit.length() / 2;
        for (int j = 0; j < b; j++) {
                if (digit.charAt(j) != digit.charAt(digit.length() - j - 1)) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(1112111));
    }
}
