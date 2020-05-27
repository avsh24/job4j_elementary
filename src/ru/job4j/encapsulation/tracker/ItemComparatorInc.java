package ru.job4j.encapsulation.tracker;

import java.util.Comparator;

public class ItemComparatorInc implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
