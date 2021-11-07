package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
            int count = 1;
            int rsl = length - section;
            while (rsl >= section) {
                rsl = rsl - section;
                count++;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(count(1, 1));
        System.out.println(count(2, 1));
        System.out.println(count(3, 2));
        System.out.println(count(4, 2));

    }
}


