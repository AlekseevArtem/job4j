package ru.job4j;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static TrackerSingle2 instance;
    private Tracker tracker = new Tracker();

    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2();
        }
        return instance;
    }

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public Item[] findAll()  {
        return tracker.findAll();
    }

    public static void main(String[] args) {
        TrackerSingle2 tracker = TrackerSingle2.getInstance();
    }
}