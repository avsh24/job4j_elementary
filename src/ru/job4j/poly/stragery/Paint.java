package ru.job4j.poly.stragery;

public class Paint {
    public static void main(String[] args) {
        draw(new Triangle());
        draw(new Square());
    }

    public static void draw(Shape shape) {
        System.out.print(shape.draw());
    }
}
