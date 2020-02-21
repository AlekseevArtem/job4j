package ru.job4j;

import ru.job4j.tracker.Tracker;

public enum TrackerSingle1 {
    INSTANCE;

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}