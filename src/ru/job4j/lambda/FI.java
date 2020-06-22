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

        String[] str = {
                new String("image 4"),
                new String("image 5"),
                new String("image 6")
        };

        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Arrays.sort(str, cmpText);
        for (String s : str) {
            System.out.println(s + " ");
        }

        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
        Arrays.sort(str, cmpDescSize);
        for (String s : str) {
            System.out.println(s + " ");
        }
    }

    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
        Comparator<Attachment> comparator = (o1, o2) -> o1.getSize() - o2.getSize();
        list.sort(comparator);
        System.out.println(list);
    }
}
