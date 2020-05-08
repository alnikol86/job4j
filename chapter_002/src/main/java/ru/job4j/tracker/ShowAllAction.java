package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "1. Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Tracker contains ====");
        ArrayList items = tracker.findAll();
        for (Object item : items) {
            System.out.println("Name: " + item + ", ID: " + item);
        }
        return true;
    }
}
