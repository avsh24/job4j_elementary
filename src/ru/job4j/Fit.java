package ru.job4j;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (170 - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height) {
        double rsl = (160 - 100) * 1.15;;
        return rsl;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(160);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 160 is " + woman);
    }
}
