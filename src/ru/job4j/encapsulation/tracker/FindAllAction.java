package ru.job4j.encapsulation.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index].getId() + " " + items[index].getName());
        }
        return true;
    }
}
