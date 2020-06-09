package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    private String generatedId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(generatedId());
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List findByName(String key) {
        List<Item> searchItems = new ArrayList();
        for (Item value : items) {
            if (value.getName().equals(key)) {
                searchItems.add(value);
            }
        }
        return searchItems;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }
}