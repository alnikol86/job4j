package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

import java.util.Comparator;

public class ItemTest {
    @Test
    public void whenFirstAndSecondSortNormalResultPositive() {
        Comparator<Item> compare = new SortItemByName();
        int rsl = compare.compare(
                new Item("First"),
                new Item("Second")
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenFirstAndSecondSortReverseResultNegative() {
        Comparator<Item> compare = new SortedItemByNameReverse();
        int rsl = compare.compare(
                new Item("First"),
                new Item("Second")
        );
        assertThat(rsl, lessThan(0));
    }
}

