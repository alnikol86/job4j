package ru.job4j.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertMatrix {
    public static void main(String[] args) {
        Integer[][] integers = {{1, 2}, {3, 4}};
        System.out.println(
        Stream.of(integers).
                flatMap(Stream::of).
                collect(Collectors.toList())
        );
    }
}
