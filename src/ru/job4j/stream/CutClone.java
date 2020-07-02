package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CutClone implements Comparator<Address> {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Stepan");
        names.add("Petrucho");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
