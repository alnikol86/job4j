package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {

    private void showMenu(List<UserAction> actions) {
        System.out.println("*** Menu ***");
        for (UserAction value : actions) {
            System.out.println(value.name());
        }
    }

    public void init(Input input, Tracker tracker, List<UserAction> list) {
        boolean run = true;
        while (run) {
            this.showMenu(list);
            int select = input.ascInt("Select: ", list.size());
            UserAction action = list.get(select);
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAllAction());
        actions.add(new ReplaceAction());
        actions.add(new DeleteAction());
        actions.add(new FindIDAction());
        actions.add(new FindNameAction());
        actions.add(new ExitAction());

        new StartUI().init(validate, tracker, actions);
    }
}
