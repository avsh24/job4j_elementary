package ru.job4j.encapsulation.tracker;

import java.util.Arrays;
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

    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }

    private int indexOf(String id) {
        int result = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] result = Arrays.copyOf(items, this.position);
        return result;
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[count++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
//        Item result = null;
//        for (int index = 0; index < this.position; index++) {
//            if (items[index].getId().equals(id)) {
//                result = items[index];
//                break;
//            }
//        }
//        return result;
//    }
}
