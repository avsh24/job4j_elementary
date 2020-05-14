package ru.job4j.encapsulation.tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
