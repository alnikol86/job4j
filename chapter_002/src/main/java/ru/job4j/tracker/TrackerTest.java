package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenArrayWithNullDeleteItCell() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.add(item1);
        Item item3 = new Item("test3");
        tracker.add(item3);
        Item[] result = tracker.findAll();
        Item[] expected = {item1, item3};
        assertThat(result, is(expected));
    }

    @Test
    public void checkSameNameInArray() {
        Tracker tracker = new Tracker();
        Item item = new Item("test0");
        tracker.add(item);
        Item item1 = new Item("test1");
        tracker.add(item1);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test3");
        tracker.add(item3);
        Item item4 = new Item("test4");
        tracker.add(item4);
        Item result = tracker.findByName("test3");
        assertThat(result.getName(), is(item3.getName()));
    }
}
