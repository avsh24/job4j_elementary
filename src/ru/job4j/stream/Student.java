package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public Student(String surname, Integer score) {
        this.surname = surname;
        this.score = score;
    }

    public int compareTo(Student o) {
        return Integer.compare(o.score, this.score);
    }

    @Override
    public String toString() {
        return "Student{"
                + "score=" + score + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return score == student.score &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }
}
