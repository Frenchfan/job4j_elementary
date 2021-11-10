package ru.job4j.array;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Merge {
        public static int[] merge(int[] left, int[] right) {
            int[] rsl = Stream.of(left, right)
                    .flatMapToInt(Arrays::stream)
                    .boxed()
                    .collect(Collectors.groupingBy(e -> e,
                            TreeMap::new, Collectors.counting()))
                    .entrySet().stream()
                    .flatMapToInt(e ->
                            LongStream.range(0, e.getValue()).mapToInt(v -> e.getKey()))
                    .toArray();

            return rsl;
        }

}

