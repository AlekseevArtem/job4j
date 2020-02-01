package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== All items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] all = tracker.findAll();
        for (int index = 0; index < all.length; index++) {
            System.out.println((index + 1) + ". Name: " + all[index].getName() + ". Id: " + all[index].getId());
        }
        return true;
    }
}
