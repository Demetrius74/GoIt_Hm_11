package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Перший список імен, для завдання 1 і 2
        List<String> names = Arrays.asList("Ivan", "Peter", "Vladimir", "Dmitri", "VladIsLav");
        System.out.println(new Task1(names));
        System.out.println(new Task2(names));

        // Ініціализація списку, для 3 завдання
        List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");
        System.out.println(new Task3(numbers));

        // багато данних
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 1L;
        Stream<Long> randomNumbers = Task4.generateRandomNumbers(a, c, m, seed);
        randomNumbers.limit(5).forEach(System.out::println);


        // Просто цифри для перемішування
        Stream<String> first = Stream.of("1", "3", "5");
        Stream<String> second = Stream.of("2", "4", "6");
        Stream<String> zipped = Task5.zip(first, second);
        zipped.forEach(System.out::println);
    }
}