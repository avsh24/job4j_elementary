package ru.job4j.inheritance.animal;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Predator");
    }
}
