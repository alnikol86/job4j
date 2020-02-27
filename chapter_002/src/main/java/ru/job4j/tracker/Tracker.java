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
        return Arrays.copyOf(items, position);
        }

    public Item findByName(String key) {
        Item item = null;
        for (int i = 0; i < position; i++) {
            Item index = items[i];
            if (index.getName().equals(key)) {
                item = index;
                break;
            }
        }
        return item;
        }

    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < position; i++) {
            Item index = items[i];
            if (index.getId().equals(id)) {
                item = index;
                break;
            }
        }
        return item;
    }
}