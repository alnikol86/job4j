
package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.StringJoiner;

public class StartUITest {
    // получаем ссылку на стандартный вывод в консоль.
    PrintStream stdout = System.out;
    // Создаем буфур для хранения вывода.
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    public void loadOutput() {
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
    }

    public void backOutput() {
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }
    @Test
    public void whenPrtMenu() {
        loadOutput();
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. null")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        backOutput();
    }
    @Test
    public void whenFindAll() {
        loadOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAllAction act = new ShowAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Name: " + item.getName() + ", ID: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        backOutput();
    }
    @Test
    public void whenFindName() {
        loadOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Test");
        tracker.add(item);
        FindNameAction act = new FindNameAction();
        String itemName = item.getName();
        String[] answers = {itemName};
        act.execute(new StubInput(answers), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Name: " + item.getName() + ", ID: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        backOutput();
    }

    /*
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item");
        tracker.add(item);
        String itemID = item.getId();
        String[] answers = {itemID};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(itemID);
        String expected = null;
        assertThat(deleted, is(expected));
    }
     */
}
