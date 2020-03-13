package ru.job4j.calculator;

public class Calculator_3 {
    public static void main(String[] args) {
        Calculator_3.plus(100, 500);
        Calculator_3.plus(4, 2);
        Calculator_3.plus(3, 5);
    }
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
