package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenArrayWithNullDeleteItCell() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName(null);
        item.setName("test1");
        item.setName(null);
        item.setName("test2");
        tracker.add(item);
        Item result = tracker.findAll(item);
    }
}
