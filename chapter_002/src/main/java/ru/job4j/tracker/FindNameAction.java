package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "5. Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.ascStr("Enter Item name: ");
        List<Item> items = tracker.findByName(name);
        for (Item value : items) {
            System.out.println("Name: " + value.getName() + ", ID: " + value.getId());
        }
        return true;
    }
}
