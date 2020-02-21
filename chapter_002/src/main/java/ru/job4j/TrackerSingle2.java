package ru.job4j;

import ru.job4j.tracker.Tracker;

public class TrackerSingle2 {
    private static Tracker instance;

    private TrackerSingle2() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}