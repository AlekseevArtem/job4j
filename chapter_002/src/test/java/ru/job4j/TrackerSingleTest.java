package ru.job4j;

import org.junit.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void checkHowEnumWorks() {
        TrackerSingle1 trackerFirst = TrackerSingle1.INSTANCE;
        TrackerSingle1 trackerSecond = TrackerSingle1.INSTANCE;
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowStaticFieldLazyLoadingWorks() {
        TrackerSingle2 trackerFirst = TrackerSingle2.getInstance();
        TrackerSingle2 trackerSecond = TrackerSingle2.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowStaticFinalFieldEagerLoadingWorks() {
        TrackerSingle3 trackerFirst = TrackerSingle3.getInstance();
        TrackerSingle3 trackerSecond = TrackerSingle3.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
    @Test
    public void checkHowPrivateStaticFinalClassLazyLoadingWorks() {
        TrackerSingle4 trackerFirst = TrackerSingle4.getInstance();
        TrackerSingle4 trackerSecond = TrackerSingle4.getInstance();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        trackerFirst.add(item1);
        trackerSecond.add(item2);
        assertThat(trackerFirst.findAll(), is(trackerSecond.findAll()));
    }
}
