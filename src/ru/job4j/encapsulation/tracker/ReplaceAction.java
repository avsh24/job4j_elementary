package ru.job4j.encapsulation.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Item is successfully replaced!");
        } else {
            System.out.println("Invalid id!");
        }
        return true;
    }
}
