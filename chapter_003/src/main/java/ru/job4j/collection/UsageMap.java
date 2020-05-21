package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("nikolaevairman@gmail.com", "Alexander Nikolaev");
        for (String key : maps.keySet()) {
            String value = maps.get(key);
            System.out.println("E-mail: " + key + ", " + "Name: " + value);
        }
    }
}
