package ru.job4j.tracker;

public class ExitAction {
    private final Callback callback;

    public ExitAction(Callback callback) {
        this.callback = callback;
    }

    public void check(int exit) {
        callback.execute(exit);
    }
}
