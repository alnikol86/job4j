package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    Map<String, Student> collect(List<Student> students, Predicate<Student> predict) {
        Map<String, Student> groups = students.stream().filter(
                predict
        ).collect(
                Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (existing, replacement) -> existing
                ));
        return groups;
    }
}
