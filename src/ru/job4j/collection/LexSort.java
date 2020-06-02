package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] l = left.split("\\.");
        String[] r = right.split("\\.");
        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            if (l != r) {
                break;
            }
        }
        if (left.length() > right.length()) {
            return 1;
        } else if (left.length() < right.length()) {
            return -1;
        }
        return left.compareTo(right);
    }
}
