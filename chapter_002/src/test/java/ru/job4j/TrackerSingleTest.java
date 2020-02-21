package ru.job4j;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void checkHowEnumWorks() {
        Tracker trackerFirst = TrackerSingle1.INSTANCE.getTracker();
        Tracker trackerSecond = TrackerSingle1.INSTANCE.getTracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowStaticFieldLazyLoadingWorks() {
        Tracker trackerFirst = TrackerSingle2.getInstance();
        Tracker trackerSecond = TrackerSingle2.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowStaticFinalFieldEagerLoadingWorks() {
        Tracker trackerFirst = TrackerSingle3.getInstance();
        Tracker trackerSecond = TrackerSingle3.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowPrivateStaticFinalClassLazyLoadingWorks() {
        Tracker trackerFirst = TrackerSingle4.getInstance();
        Tracker trackerSecond = TrackerSingle4.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
}
