package ru.job4j.inheritance.animal;

public class Tiger extends Animal {

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }
}
