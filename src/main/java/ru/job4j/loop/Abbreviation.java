package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder myAbbreviation = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                myAbbreviation.append(s.charAt(i));
            }
        }
        return myAbbreviation.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("North Atlantic Treaty Organization"));
    }
}
