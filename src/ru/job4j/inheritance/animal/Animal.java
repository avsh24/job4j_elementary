package ru.job4j.inheritance.animal;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator("Predator");
        Tiger tiger = new Tiger("Tiger");
    }
}
