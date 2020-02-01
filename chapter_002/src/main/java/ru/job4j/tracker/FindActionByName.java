package ru.job4j.tracker;

public class FindActionByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] temp = tracker.findByName(name);
        if (temp.length != 0) {
            for (Item item : temp) {
                System.out.println("Name: " + item.getName() + ". Id: " + item.getId());
            }
        } else {
            System.out.println("Items not found. Invalid name");
        }
        return true;
    }
}
