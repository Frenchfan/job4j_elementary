package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int totalsize = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalsize++;
            }
        }
        int resultsize = (int) Math.ceil(Math.sqrt(totalsize));
        int[][] result = new int[resultsize][resultsize];
        int counter = 0, counter2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[counter][counter2] = array[i][j];
                counter2++;
                if (counter2 == resultsize) {
                    counter2 = 0;
                    counter++;
                }
            }
        }
        for (int i = counter; i < resultsize; i++) {
            for (int j = counter2; j < resultsize; j++) {
                result[i][j] = 0;
            }
        }
        return result;
    }
}