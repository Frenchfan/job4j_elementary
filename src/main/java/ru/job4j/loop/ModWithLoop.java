package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n - d >= 0) {
            n = n - d;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(mod(4, 2));
        System.out.println(mod(3, 2));
        System.out.println(mod(8, 3));
        System.out.println(mod(0, 3));
    }
}
