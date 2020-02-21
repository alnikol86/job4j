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
        for (int i = 0; i < position; i++) {
            Item names = items[i];
            if (names != null) {
                items[i] = names;
            }
        }
        return Arrays.copyOf(items, position);
        }

    public Item[] findByName(String key) {
        for (int i = 0; i < position; i++) {
            Item names = items[i];
            if (names.getName().equals(key)) {
                items[i] = names;
                }
            }
        return Arrays.copyOf(items, position);
        }

    public Item findById(String id) {
        for (int i = 0; i < items.length; i++) {
            Item index = items[i];
            if (index.getId().equals(id)) {
                return index;
            }
        }
        return null;
    }
}