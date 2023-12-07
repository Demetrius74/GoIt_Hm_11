package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        int size = Math.min(firstList.size(), secondList.size());
        return IntStream.range(0, size)
                .mapToObj(i -> Arrays.asList(firstList.get(i), secondList.get(i)))
                .flatMap(List::stream);
    }
}
