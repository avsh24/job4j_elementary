package ru.job4j.encapsulation.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Creatr a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAll(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index].getId() + " " + items[index].getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Item is successfully replaced!");
        } else {
            System.out.println("Invalid id!");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item is successfully delete!");
        } else {
            System.out.println("Invalid id!");
        }
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
        Item[] items = tracker.findByName("Item");
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index].getId() + " " + items[index].getName());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAll(tracker);
                run = false;
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
                run = false;
            } else if (select == 3) {
                StartUI.deteleItem(input, tracker);
                run = false;
            } else if (select == 4) {
                StartUI.findById(input, tracker);
                run = false;
            } else if (select == 5) {
                StartUI.findByName(tracker);
                run = false;
            } else if (select == 6) {
                System.out.println("=== Exit Program ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu. ");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.findAll(tracker);
        StartUI.replaceItem(input, tracker);
        StartUI.deteleItem(input, tracker);
        StartUI.findById(input, tracker);
        StartUI.findByName(tracker);
    }
}
