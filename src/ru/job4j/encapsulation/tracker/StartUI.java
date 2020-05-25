package ru.job4j.encapsulation.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Creatr a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAll(Tracker tracker) {
        System.out.println("=== Show all items ====");
        List<Item> items = new ArrayList<>();
        tracker.findAll();
        for (Item item : items) {
            if (item.getName().equals(item.getId())) {
                items.add(item);
            }
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        tracker.replace(id, new Item(name));
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getId() + " " + item.getName());
        } else {
            System.out.println("Item is not found!");
        }
    }

    public static void findByName(Tracker tracker) {
        System.out.println("=== Find items by name ====");
        List<Item> items = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(tracker)) {
                items.add(item);
            }
        }
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu. ");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
//        System.out.println("0. Add new Item");
//        System.out.println("1. Show all items");
//        System.out.println("2. Edit item");
//        System.out.println("3. Delete item");
//        System.out.println("4. Find item by Id");
//        System.out.println("5. Find items by name");
//        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
                new CreateAction();
                new FindAllAction();
                new ReplaceAction();
                new DeleteAction();
                new FindByIdAction();
                new FindByNameAction();
        new StartUI().init(validate, tracker, actions);
    }
}
