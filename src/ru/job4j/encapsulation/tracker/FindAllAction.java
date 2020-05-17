package ru.job4j.encapsulation.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index].getId() + " " + items[index].getName());
        }
        return true;
    }
}
