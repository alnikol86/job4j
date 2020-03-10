package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    private void showMenu() {
        System.out.print("<< Menu >>" + System.lineSeparator()
                + "0. Add new Item" + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Edit item" + System.lineSeparator()
                + "3. Delete item" + System.lineSeparator()
                + "4. Find item by Id" + System.lineSeparator()
                + "5. Find items by name" + System.lineSeparator()
                + "6. Exit Program" + System.lineSeparator()
                + "Select:");
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("==== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==== Tracker has contained ====");
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("==== Edit item ====");
                System.out.print("Enter the item ID for replace: ");
                String id = scanner.nextLine();
                System.out.println("Enter a new item name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("==== Delete item ====");
                System.out.print("Enter Item id: ");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("==== Find item by id ====");
                System.out.print("Enter Item id: ");
                String id = scanner.nextLine();
                tracker.findById(id);
            } else if (select == 5) {
                System.out.println("==== Find items by name ====");
                System.out.print("Enter Item name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);
            } else if (select == 6) {
                System.out.println("Exit out of the program.");
                run = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
