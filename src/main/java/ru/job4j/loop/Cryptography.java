package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            return "empty";
        } else if (s.length() <= 4) {
            return s;
        }
        StringBuilder myString = new StringBuilder(s);
        for (int i = 0; i < s.length() - 4; i++) {
            myString.setCharAt(i, '#');
        }

        return myString.toString();
    }

    public static void main(String[] args) {
        System.out.println(code("4556364607935616"));
    }
}
