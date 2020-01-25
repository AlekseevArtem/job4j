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
                Item[] all = tracker.findAll();
                for (int index = 0; index < all.length; index++) {
                    System.out.println((index + 1) + ". Name: " + all[index].getName() + ". Id: " + all[index].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                String id = input.askStr("Inter the Item Id whose name you want to rename:");
                String newName = input.askStr("Enter new name: ");
                Item newItem = new Item(newName);
                tracker.replace(id, newItem);
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                String id = input.askStr("Inter the Item Id which you want to delete:");
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                String id = input.askStr("Enter id: ");
                System.out.println("Name: " + tracker.findById(id).getName() + ". Id: " + tracker.findById(id).getId());
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] temp = tracker.findByName(name);
                for (Item item : temp) {
                    System.out.println("Name: " + item.getName() + ". Id: " + item.getId());
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
