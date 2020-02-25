package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;


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
    public void checkHowFindAllWork() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item2);
        tracker.add(item1);
        assertThat(tracker.findAll(), is(Arrays.asList(item1, item2, item3, item2, item1)));
    }

    @Test
    public void checkHowFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item2);
        tracker.add(item1);
        assertThat(tracker.findByName("test1"), is(Arrays.asList(item1, item1)));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
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

    @Test
    public void checkComparators() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        Item item3 = new Item("3");
        Item item4 = new Item("4");
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item1);
        tracker.add(item2);
        tracker.findAll().sort(new SortByNameItem());
        assertThat(tracker.findAll(), is(Arrays.asList(item1, item2, item3, item4)));
    }

    @Test
    public void checkComparatorsDescending() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        Item item3 = new Item("3");
        Item item4 = new Item("4");
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item1);
        tracker.add(item2);
        tracker.findAll().sort(new SortByNameItemDescending());
        assertThat(tracker.findAll(), is(Arrays.asList(item4, item3, item2, item1)));
    }
}
