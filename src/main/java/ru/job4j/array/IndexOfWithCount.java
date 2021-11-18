package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int counter = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c && counter + 1 == number) {
                return i;
            } else if (string[i] == c) {
                counter++;
            }
        }
        return -1;
    }
}
