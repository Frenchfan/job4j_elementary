package ru.job4j.array;

/*Метод принимает массив целочисленных значений,
при этом это могут быть как положительные значения,
так и отрицательные. Необходимо реализовать в методе следующее:

        1. Найти максимальное значение в массиве;
        2. Найти минимальное значение в массиве;
        3. Вернуть разницу между максимальным и минимальным значением в массиве.

        При этом массив не может быть пустым,
        поэтому дополнительная проверка, что длина массива больше 0 - не нужна.
        */

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return max - min;
    }
}