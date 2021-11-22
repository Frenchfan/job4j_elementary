package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        if (num > prizes.length) {
            num = (num - 1) - (num - 1) / prizes.length * prizes.length;
            return prizes[num];
        }
        return prizes[num - 1];
    }
}
