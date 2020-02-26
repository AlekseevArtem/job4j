package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== All items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            System.out.println((items.indexOf(item) + 1) + ". Name: " + item.getName() + ". Id: " + item.getId());
        }
        return true;
    }
}
