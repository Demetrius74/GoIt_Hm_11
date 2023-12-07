package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    private final List<String> names;

    public Task2(List<String> names) {
        this.names = names;
    }

    /**
     * Sorted names and conversion to uppercase
     * @return Sorted list string
     */
    public List<String> namesToUpperCaseConvert() {
        return this.names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    @Override
    public String toString(){
        return this.namesToUpperCaseConvert().toString();
    }
}
