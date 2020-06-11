package ru.job4j.collection;

import java.util.Comparator;

public class JobDeskByName implements Comparator<Job> {
    @Override
    public int compare(Job obj1, Job obj2) {
        return obj2.getName().compareTo(obj1.getName());
    }
}
