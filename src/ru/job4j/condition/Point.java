package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

//    public static double distance(int x1, int y1, int x2, int y2) {
//        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        return rsl;
//    }
//    public static void main(String[] args) {
//        double result = Point.distance(0, 0, 2, 0);
//        System.out.println("result (0, 0) to (2, 0) " + result);

        // Тест для проверки расстояний между точками в системе координат.
//        double in = 2.0;
//        double expected = 1.4142135623730951;
//        double out = Math.sqrt(in);
//        boolean passed = expected == out;
//        System.out.println("result (0, 0) to (2, 0) " + passed);
//    }
}
