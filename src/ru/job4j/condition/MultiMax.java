package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        result = (second > first) && (second > third) ? second : (third > first)  && (third > second) ? third : first;
        return result;
    }
}
