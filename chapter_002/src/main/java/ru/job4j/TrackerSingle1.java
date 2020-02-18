package ru.job4j;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerSingle1 {
    INSTANCE;

    private Tracker tracker = new Tracker();

    public Item add(Item model) {
        tracker.add(model);
        return model;
    }

    public Item[] findAll()  {
        return tracker.findAll();
    }
}