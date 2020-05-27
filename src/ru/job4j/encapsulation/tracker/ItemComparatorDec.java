package ru.job4j.encapsulation.tracker;

import java.util.Comparator;

public class ItemComparatorDec implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
