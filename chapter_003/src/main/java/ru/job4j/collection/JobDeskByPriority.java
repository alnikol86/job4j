package ru.job4j.collection;

import java.util.Comparator;

public class JobDeskByPriority implements Comparator<Job> {
    @Override
    public int compare(Job obj1, Job obj2) {
        return Integer.compare(obj2.getPriority(), obj1.getPriority());
    }
}
