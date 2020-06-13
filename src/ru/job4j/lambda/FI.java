package ru.job4j.lambda;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        Arrays.sort(atts, comparator);
        System.out.println(atts);
    }
    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
        Function<Attachment, InputStream> comparator = (left, right) -> {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        Arrays.sort(list, func);
        System.out.println(list);
    }
}
