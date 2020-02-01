package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Inter the Item Id which you want to delete:");
        if (tracker.delete(id)) {
            System.out.println("Item successfully deleted");
        } else {
            System.out.println("Deleting fallen. Invalid id");
        }
        return true;
    }
}
