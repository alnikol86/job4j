package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "0. Create Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.ascStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
