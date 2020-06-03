package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftInt = 0;
        int rightInt = 0;
        String[] leftInts = left.split("\\.");
        String[] rightInts = right.split("\\.");
        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            leftInt = Integer.parseInt(leftInts[0]);
            rightInt = Integer.parseInt(rightInts[0]);
            if (leftInt != rightInt) {
                return Integer.compare(leftInt, rightInt);
            }
        }
        return left.compareTo(right);
    }
}
