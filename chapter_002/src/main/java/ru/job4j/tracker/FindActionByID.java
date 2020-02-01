package ru.job4j.tracker;

public class FindActionByID implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item temp = tracker.findById(id);
        if (temp != null) {
            System.out.println("Name: " + temp.getName() + ". Id: " + temp.getId());
        } else {
            System.out.println("Item not found. Invalid id");
        }
        return true;
    }
}
