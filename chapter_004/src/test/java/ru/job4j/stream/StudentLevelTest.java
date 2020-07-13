package ru.job4j.stream;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

public class StudentLevelTest {
    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(128, "Alex"));
        input.add(new Student(28, "Masha"));
        List<Student> expected = List.of(
                new Student(28, "Masha"),
                new Student(128, "Alex")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }
    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }
    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Alex"));
        List<Student> expected = List.of(
                new Student(28, "Alex")
        );
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}
