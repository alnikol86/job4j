package ru.job4j.oop;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println("Load Animal");
    }

    public Animal(String name) {
        this.name = name;
    }
}
