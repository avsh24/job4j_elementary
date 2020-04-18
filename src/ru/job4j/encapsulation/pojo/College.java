package ru.job4j.encapsulation.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Shemyakin Aleksey Vladimirovich");
        student.setGroup("Стажер");
        student.setStartDate(new Date());
        System.out.println("Студент: " + student.getFio() + " Группа: " + student.getGroup() + " Дата поступления: " + student.getStartDate());
    }
}
