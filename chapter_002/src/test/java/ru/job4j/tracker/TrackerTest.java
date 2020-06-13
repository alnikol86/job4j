package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
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
        List<Item> result = tracker.findAll();
        List<Item> expected = Arrays.asList(item1, item3);
        assertThat(result, is(expected));
    }

    @Test
    public void checkSameNameInArray() {
        Tracker tracker = new Tracker();
        Item item = new Item("test0");
        tracker.add(item);
        Item item1 = new Item("test3");
        tracker.add(item1);
        Item item2 = new Item("test3");
        tracker.add(item2);
        Item item3 = new Item("test1");
        tracker.add(item3);
        Item item4 = new Item("test3");
        tracker.add(item4);
        List<Item> result = tracker.findByName("test3");
        List<Item> expected = Arrays.asList(item1, item2, item4);
        assertThat(result, is(expected));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWitchDesc = new Item("Bug with description");
        tracker.replace(id, bugWitchDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}