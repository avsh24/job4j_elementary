package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15; // формула расчета идеальный вес для мужчин.
        return rsl;
    }
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(160);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 160 is " + woman);

        // Тест расчета идеальный вес для мужчин.
        double in = 170;
        double expected = 80.5;
        double out = manWeight(in);
        boolean passed = expected == out;
        System.out.println("Man 170 is " + passed);

        // Тест расчета идеальный вес для женщин.
        double in1 = 160;
        double expected1 = 57.49999999999999;
        double out1 = womanWeight(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("Woman 160 is " + passed1);
    }
}
