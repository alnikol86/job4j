package ru.job4j.tracker;

public class FindIDAction implements UserAction {
    @Override
    public String name() {
        return "==== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.ascStr("Enter Item id: ");
        Item item = tracker.findById(id);
        String result = item == null ? "The Item has not contained in Array. Check ID for the Item." : item.getName();
        System.out.println(result);
        return true;
    }
}
