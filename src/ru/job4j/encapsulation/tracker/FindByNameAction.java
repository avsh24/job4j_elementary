package ru.job4j.encapsulation.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findByName("Item");
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index].getId() + " " + items[index].getName());
        }
        return true;
    }
}
