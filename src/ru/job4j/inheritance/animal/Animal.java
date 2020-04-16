package ru.job4j.inheritance.animal;

public class Animal {
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
