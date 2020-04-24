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
        Item result = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
                result = current;
                break;
        }
        return result;
    }

    public Item findByName(String key) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getName().equals(key)) {
                result = current;
                break;
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < position; index++) {
            Item current = items[index];
            if (current.getId().equals(id)) {
                result = current;
                break;
            }
        }
        return result;
    }
}
