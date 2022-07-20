package ru.job4j.array;

import java.util.Arrays;

/*Назовем аномалиями диапазоны индексов,
на которых значения массива меньше или равно
down или больше или равно up. Ваша задача найти
 все аномалии в массиве. Если в аномалии одно,
 число, то нужно вернуть диапазон [i, i] -
 где i индекс числа выходящего за границы.

        Например,
        {5, 10, 15}, up = 16, down = 4 => аномалий нет
        {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
        {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
        {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
*/

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int start = 0;
        int finish = 0;
        boolean startAnomaly = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                if (!startAnomaly) {
                    startAnomaly = true;
                    start = i;
                } else if (i == data.length - 1) {
                    result[count] = new int[]{start, i};
                    count++;
                }
            } else {
                if (startAnomaly) {
                    startAnomaly = false;
                    finish = i - 1;
                    result[count] = new int[]{start, finish};
                    count++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        System.out.println(Arrays.deepToString(Anomaly.found(data, up, down)));
    }
}
