package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    private final List<String> numbers;

    public Task3(List<String> numbers) {
        this.numbers = numbers;
    }

    public String sortNumbers() {
        return this.numbers.stream()
                .flatMap(numbers -> Arrays.stream(numbers.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString(){
        return this.sortNumbers();
    }
}
