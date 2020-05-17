package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "1. Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Tracker contains ====");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            System.out.println("Name: " + item.getName() + ", ID: " + item.getId());
        }
        return true;
    }
}
