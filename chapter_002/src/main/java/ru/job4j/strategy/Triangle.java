package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner image = new StringJoiner(System.lineSeparator());
        image.add("  *");
        image.add(" ***");
        image.add("*****");
        return image.toString();
    }
}
