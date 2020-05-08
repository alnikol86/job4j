package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {

    private void showMenu(ArrayList<UserAction> actions) {
        System.out.println("*** Menu ***");
        for (UserAction value : actions) {
            System.out.println(value.name());
        }
    }

    public void init(Input input, Tracker tracker, ArrayList<UserAction> arrayList) {
        boolean run = true;
        while (run) {
            this.showMenu(arrayList);
            int select = input.ascInt("Select: ", arrayList.size());
            UserAction action = arrayList.get(select);
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>();
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
