package ru.job4j;

public class MathFunc {
    public static void main(String[] args) {
        int result = MathFunc.func1(100);
        System.out.println(result);
    }
    public static int func1(int x) {
        int result = x * x + 1;
        return result;
    }
}
