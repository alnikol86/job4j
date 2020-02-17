package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    private String generatedId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(generatedId());
        items[this.position++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            Item names = items[i];
            if (names != null) {
                itemsWithoutNull[this.position] = names;
                this.position++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, position);
        return  itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] sameName = new Item[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            Item names = items[i];
            if (names.getName().equals(key)) {
                sameName[this.position] = names;
                this.position++;
                }
            }
        sameName = Arrays.copyOf(sameName, position);
        return sameName;
        }

    public Item findById(String id) {
        for (int i = 0; i < items.length; i++) {
            Item index = items[i];
            if (index.getId() == id) {
                return index;
            }
        }
        return null;
    }
}