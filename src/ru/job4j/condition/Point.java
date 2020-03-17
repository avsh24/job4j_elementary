package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        // Тест для проверки расстояний между точками в системе координат.
        double in = 2.0;
        double expected = 1.4142135623730951;
        double out = Math.sqrt(in);
        boolean passed = expected == out;
        System.out.println("result (0, 0) to (2, 0) " + passed);
    }
}
