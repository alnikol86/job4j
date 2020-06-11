package ru.job4j.collection;

import java.util.Comparator;

public class JobDeskByPriorityReverse implements Comparator<Job> {
    @Override
    public int compare(Job obj1, Job obj2) {
        return Integer.compare(obj1.getPriority(), obj2.getPriority());
    }
}