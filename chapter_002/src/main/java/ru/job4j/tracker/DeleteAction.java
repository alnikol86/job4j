package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "3. Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String id = input.ascStr("Enter Item id: ");
        String result = tracker.delete(id) ? "The Item was deleted." : "The Item was not deleted. Check ID for the Item.";
        System.out.println(result);
        return true;
    }
}
