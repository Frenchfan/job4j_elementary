package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int chaincounter = 1;
        int maxcounter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                chaincounter++;
                maxcounter = chaincounter > maxcounter ? chaincounter : maxcounter;
            } else {
                maxcounter = chaincounter > maxcounter ? chaincounter : maxcounter;
                chaincounter = 1;
            }
        }
        return maxcounter;
    }
}
