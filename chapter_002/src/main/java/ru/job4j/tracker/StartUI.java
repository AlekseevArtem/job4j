package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(actions.indexOf(action) + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        ValidateInput validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
                actions.add(new CreateAction());
                actions.add(new FindAllAction());
                actions.add(new EditAction());
                actions.add(new DeleteAction());
                actions.add(new FindActionByID());
                actions.add(new FindActionByName());
                actions.add(new ExitAction());
        new StartUI().init(validate, tracker, actions);
    }
}