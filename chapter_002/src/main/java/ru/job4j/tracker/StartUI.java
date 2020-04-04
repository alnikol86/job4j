package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.ascStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void allItems(Input input, Tracker tracker) {
        System.out.println("==== Tracker has contained ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; ++i) {
            System.out.println("Name: " + items[i].getName()
                    + ", ID: " + items[i].getId());
        }
    }
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("==== Edit item ====");
        String id = input.ascStr("Enter the item ID for replace: ");
        String name = input.ascStr("Enter a new item name: ");
        Item item = new Item(name);
        String result = tracker.replace(id, item) ? "The operation was successful" : "The operation wasn't successful. Check ID for the item.";
        System.out.println(result);
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String id = input.ascStr("Enter Item id: ");
        String result = tracker.delete(id) ? "The Item was deleted." : "The Item was not deleted. Check ID for the Item.";
        System.out.println(result);
    }
    public static void findItemId(Input input, Tracker tracker) {
        System.out.println("==== Find item by id ====");
        String id = input.ascStr("Enter Item id: ");
        Item item = tracker.findById(id);
        String result = item == null ? "The Item has not contained in Array. Check ID for the Item." : item.getName();
        System.out.println(result);
    }
    public static void findItemName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.ascStr("Enter Item name: ");
        Item[] items = tracker.findByName(name);
        for (int i = 0; i < items.length; ++i) {
            System.out.println("Name: " + items[i].getName() + ", ID: "
                    + items[i].getId());
        }
    }
    private void showMenu() {
        System.out.println("<< Menu >>" + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Edit item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by name" + System.lineSeparator()
                + "6. Exit Program");
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.ascInt("Inter the menu number: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemId(input, tracker);
            } else if (select == 5) {
                StartUI.findItemName(input, tracker);
            } else if (select == 6) {
                System.out.println("Exit out of the program.");
                run = false;
            }
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
