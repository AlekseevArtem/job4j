package ru.job4j;

import ru.job4j.tracker.Tracker;

public class TrackerSingle4 {

    private TrackerSingle4() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}