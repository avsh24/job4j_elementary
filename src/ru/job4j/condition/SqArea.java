package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }
    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, real = " + result);

        // Тесты для стороны прямоугольника.
        int p = 4, k = 1;
        double expected = 1.0;
        double out = square(p, k);
        boolean passed = expected == out;
        System.out.println("p = 4, k = 1, real = " + passed);
    }
}
