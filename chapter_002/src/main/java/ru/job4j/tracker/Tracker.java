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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        if (findById(id) != null) {
        int cellForReplace = indexOf(id);
        item.setId(id);
        items[cellForReplace] = item;
        rsl = true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        if (findById(id) != null) {
           int index = indexOf(id);
           int startPos = index + 1;
           int distPos = index;
           int size = position - index;
           System.arraycopy(items, startPos, items, distPos, size);
           items[position - 1] = null;
           position--;
           rsl = true;
        }
        return rsl;
    }
}