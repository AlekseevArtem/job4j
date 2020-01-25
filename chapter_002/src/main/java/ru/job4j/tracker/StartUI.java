package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Tracker tracker) {
        System.out.println("=== All items ====");
        for (int index = 0; index < tracker.findAll().length; index++) {
            System.out.println((index + 1) + ". Name: " + tracker.findAll()[index].getName() + ". Id: " + tracker.findAll()[index].getId());
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        int index = input.askInt("Choose which Name from 1 out of " + tracker.findAll().length + " do you want to change:");
        String newName = input.askStr("Enter new name: ");
        tracker.findAll()[index - 1].setName(newName);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        int number = input.askInt("Choose which Item from 1 out of " + tracker.findAll().length + " do you want to delete:");
        tracker.delete(number);
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("Enter id: ");
        System.out.println("Name: " + tracker.findById(id).getName() + ". Id: " + tracker.findById(id).getId());
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        for (int index = 0; index < tracker.findByName(name).length; index++) {
            System.out.println("Name: " + tracker.findByName(name)[index].getName() + ". Id: " + tracker.findByName(name)[index].getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select:");
            if (select == 0) {
                StartUI.createItem(input, tracker);
           } else if (select == 1) {
                StartUI.showItems(tracker);
            } else if (select == 2) {
                StartUI.showItems(tracker);
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.showItems(tracker);
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu." + "\n" + "0. Add new Item" + "\n" + "1. Show all items" + "\n" + "2. Edit item" + "\n" + "3. Delete item" + "\n"
                + "4. Find item by Id" + "\n" +  "5. Find items by name" + "\n" +  "6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}


