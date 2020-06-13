package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI implements Callback {
    private boolean run = true;
    private ExitAction exit = new ExitAction(this);

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size() + 1);
            exit.check(select);
            if (!run) {
                break;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        int index = 0;
        for (UserAction action : actions) {
            System.out.println(index++ + ". " + action.name());
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
        new StartUI().init(validate, tracker, actions);
    }

    @Override
    public void execute(int message) {
        Integer six = 6;
        run = !six.equals(message);
    }
}