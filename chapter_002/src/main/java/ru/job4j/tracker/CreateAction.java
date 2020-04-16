package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "==== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.ascStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}