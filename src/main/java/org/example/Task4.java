package org.example;

import java.util.stream.Stream;

public class Task4 {

    public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
