package ru.job4j.encapsulation.tracker;

import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findAll() {
        Item item = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
                item = current;
                break;
        }
        return item;
    }

    public Item findByName(String key) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getName().equals(key)) {
                item = current;
                break;
            }
        }
        return item;
    }

    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getId().equals(id)) {
                item = current;
                break;
            }
        }
        return item;
    }
}
