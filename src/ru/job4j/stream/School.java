package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> rsl = students.stream()
                .filter(predict)
                .collect(Collectors.toList());
        return rsl;
    }

    Map<String, Student> listToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student
                ));
    }
}
