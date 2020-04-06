package ru.job4j.array;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            swap();
        }
        return data;
    }
}
