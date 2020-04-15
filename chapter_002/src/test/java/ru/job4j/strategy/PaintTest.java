package ru.job4j.strategy;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

public class PaintTest {
    // получаем ссылку на стандартный вывод в консоль.
    PrintStream stdout = System.out;
    // Создаем буфур для хранения вывода.
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
    public void whenDrawSquare() {
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("****")
                                .add("*  *")
                                .add("*  *")
                                .add("****")
                                .add("")
                                .toString()
                )
        );
    }

    @Test
    public void whenTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  *")
                                .add(" ***")
                                .add("*****")
                                .add("")
                                .toString()
                ));
    }
}
