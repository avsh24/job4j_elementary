package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * 2;
        double s = l * h;
        return s;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, real = " + result1);
    }
}
