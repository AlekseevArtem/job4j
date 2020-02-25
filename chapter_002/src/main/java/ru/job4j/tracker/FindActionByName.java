package ru.job4j.tracker;

import java.util.ArrayList;

public class FindActionByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        ArrayList<Item> items = tracker.findByName(name);
        if (items != null) {
            for (Item item : items) {
                System.out.println("Name: " + item.getName() + ". Id: " + item.getId());
            }
        } else {
            System.out.println("Items not found. Invalid name");
        }
        return true;
    }
}
