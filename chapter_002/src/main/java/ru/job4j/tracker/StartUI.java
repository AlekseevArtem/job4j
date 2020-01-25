package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select:");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
           } else if (select == 1) {
                System.out.println("=== All items ====");
                for (int index = 0; index < tracker.findAll().length; index++) {
                    System.out.println((index + 1) + ". Name: " + tracker.findAll()[index].getName() + ". Id: " + tracker.findAll()[index].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                String id = input.askStr("Enter id: ");
                System.out.println("Name: " + tracker.findById(id).getName() + ". Id: " + tracker.findById(id).getId());
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter name: ");
                for (int index = 0; index < tracker.findByName(name).length; index++) {
                    System.out.println("Name: " + tracker.findByName(name)[index].getName() + ". Id: " + tracker.findByName(name)[index].getId());
                }
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