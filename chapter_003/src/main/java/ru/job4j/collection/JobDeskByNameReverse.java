package ru.job4j.collection;

import java.util.Comparator;

public class JobDeskByNameReverse implements Comparator<Job> {
    @Override
    public int compare(Job obj1, Job obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}
