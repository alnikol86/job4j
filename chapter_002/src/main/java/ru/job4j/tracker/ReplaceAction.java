package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "==== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.ascStr("Enter the item ID for replace: ");
        String name = input.ascStr("Enter a new item name: ");
        Item item = new Item(name);
        String result = tracker.replace(id, item) ? "The operation was successful" : "The operation wasn't successful. Check ID for the item.";
        System.out.println(result);
        return true;
    }
}
