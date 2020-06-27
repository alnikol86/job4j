package ru.job4j.stream;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SchoolTest {
    @Test
    public void whenGroupA() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(50, "Ivanov"),
                new Student(70, "Petrov"),
                new Student(0, "Sidorov")
        );
        Predicate<Student> groupA -> 70 >= groupA.getScore <= 100;
        List<Student> group = school.collect(students, groupA);
        assertThat(group.get(0).getSurname(), is("Petrov"));
    }
    @Test
    public void whenGroupB() {
        public void whenGroupB() {
            School school = new School();
            List<Student> students = Arrays.asList(
                    new Student(50, "Ivanov"),
                    new Student(70, "Petrov"),
                    new Student(0, "Sidorov")
            );
            Predicate<Student> groupB -> 50 >= groupB.getScore < 70;
            List<Student> group = school.collect(students, groupB);
            assertThat(group.get(0).getSurname(), is("Ivanov"));
        }
    }
    @Test
    public void whenGroupC() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(50, "Ivanov"),
                new Student(70, "Petrov"),
                new Student(0, "Sidorov")
        );
        Predicate<Student> groupC -> 0 <= groupC.getScore < 50;
        List<Student> group = school.collect(students, groupC);
        assertThat(group.get(0).getSurname(), is("Sidorov"));
    }
}
