package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition1 = first > second;
        int compare1 = condition1 ? first : second;
        boolean condition2 = compare1 > third;
        int result = condition2 ? compare1 : third;
        return result;
    }
}
