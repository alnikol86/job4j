package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StartUITest {
    // получаем ссылку на стандартный вывод в консоль.
    PrintStream stdout = System.out;
    // Создаем буфер для хранения вывода.
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
    }

    @After
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
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(action);
        new StartUI().init(input, new Tracker(), actions);
        assertThat(action.isCall(), is(true));
    }
    @Test
    public void whenPrtMenu() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(action);
        new StartUI().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("*** Menu ***")
                .add("null")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAllAction act = new ShowAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("==== Tracker contains ====")
                .add("Name: " + item.getName() + ", ID: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
    @Test
    public void whenFindName() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test");
        tracker.add(item);
        FindNameAction act = new FindNameAction();
        String itemName = item.getName();
        String[] answers = {itemName};
        act.execute(new StubInput(answers), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("==== Find items by name ====")
                .add("Name: " + item.getName() + ", ID: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
    @Test
    public void whenInvalidInout() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.ascInt("Enter");
        assertThat(
                out.toString(), is(String.format("Please enter validate data again.%n"))
        );
    }
    @Test
    public void whenInvalidKey() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"10", "1"})
        );
        input.ascInt("Enter", 6);
        assertThat(
                out.toString(), is(String.format("Please select key from menu.%n"))
        );
    }
}