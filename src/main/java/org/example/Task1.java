package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    private final List<String> names;

    public Task1(List<String> names) {
        this.names = names;
    }

    /**
     * Functions for sorting names List
     * @return Sorted names list as String
     */
    public String nameSorted() {
        return IntStream.range(0, this.names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + this.names.get(i))
                .collect(Collectors.joining(", ")) + "...";
    }

    @Override
    public String toString(){
        return this.nameSorted();
    }
}
