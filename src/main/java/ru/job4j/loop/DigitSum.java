package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String digit = String.valueOf(num);
        for (int i = 0; i < digit.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(digit.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(156));
    }
}
