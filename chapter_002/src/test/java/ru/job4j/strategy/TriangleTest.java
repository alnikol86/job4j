package ru.job4j.strategy;

import org.junit.Test;
import java.util.StringJoiner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(
                new StringJoiner(System.lineSeparator())
                        .add("  *")
                        .add(" ***")
                        .add("*****")
                        .toString()
                )
        );
    }
}
