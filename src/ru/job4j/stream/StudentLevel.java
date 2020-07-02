package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> leveOf(List<Student>
                                               students, int bound) {
        return students.stream()
                .filter(student -> student != null)
                .sorted((left, right) -> left.getSurname().compareTo(right.getSurname()))
                .takeWhile(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }
}
