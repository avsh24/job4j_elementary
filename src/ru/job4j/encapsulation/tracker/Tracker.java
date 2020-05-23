package ru.job4j.encapsulation.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
//    private final Item[] items = new Item[100];
//    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
//        this.items[position++] = item;
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
            items.set(index, item);
//            items[index] = item;
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
            if (index != -1) {
                items.remove(index);
//                items[index] = null;
//                System.arraycopy(items, index + 1, items, index, position - index - 1);
//                position--;
                result = true;
            }
        return result;
    }

    private int indexOf(String id) {
        int result = -1;
        int index = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = index;
                break;
            }
        }
//        for (int index = 0; index < position; index++) {
//            if (items[index].getId().equals(id)) {
//                result = index;
//                break;
//            }
//        }
        return result;
    }

    public List<Item> findAll() {
//        Item[] result = Arrays.copyOf(items, this.position);
        return items;
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
//        Item[] result = new Item[this.position];
//        for (int index = 0; index < this.position; index++) {
//            if (items[index].getName().equals(key)) {
//                result[count++] = this.items[index];
//            }
//        }
        }
        return result;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? null : items.get(index);
//        return index != -1 ? items[index] : null;
    }
}
