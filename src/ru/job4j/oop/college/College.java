package ru.job4j.oop.college;

import ru.job4j.oop.Student;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;

        System.out.println(new Freshman());
        System.out.println(new Student());
        System.out.println(new Object());
    }
}
