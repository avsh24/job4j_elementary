package ru.job4j.encapsulation.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item is successfully delete!");
        } else {
            System.out.println("Invalid id!");
        }
        return true;
    }
}
