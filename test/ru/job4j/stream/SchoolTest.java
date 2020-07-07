package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void a() {
        School school = new School();
        List<Student> input = List.of(
                new Student(30, "Ivan"),
                new Student(60, "Vasya"),
                new Student(80, "Elena")
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 70 && k.getScore() <= 100;
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Elena"));
    }

    @Test
    public void b() {
        School school = new School();
        List<Student> input = List.of(
                new Student(30, "Ivan"),
                new Student(60, "Vasya"),
                new Student(80, "Elena")
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 50 && k.getScore() < 70;
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Vasya"));
    }

    @Test
    public void c() {
        School school = new School();
        List<Student> input = List.of(
                new Student(30, "Ivan"),
                new Student(60, "Vasya"),
                new Student(80, "Elena")
        );
        Predicate<Student> aGroup = k -> k.getScore() >= 0 && k.getScore() < 50;
        assertThat(school.collect(input, aGroup).get(0).getSurname(), is("Ivan"));
    }

    @Test
    public void map() {
        List<Student> students = List.of(
                new Student(30, "Ivan"),
                new Student(60, "Vasya"),
                new Student(80, "Elena")
        );
        Map<String, Student> expected = new HashMap<>();
        expected.put("Ivan", new Student(30, "Ivan"));
        expected.put("Vasya", new Student(60, "Vasya"));
        expected.put("Elena", new Student(80, "Elena"));
        assertThat(new School().listToMap(students), is(expected));
    }
}
