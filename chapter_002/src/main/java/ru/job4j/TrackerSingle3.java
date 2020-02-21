package ru.job4j;

import ru.job4j.tracker.Tracker;

public class TrackerSingle3 {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingle3() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}