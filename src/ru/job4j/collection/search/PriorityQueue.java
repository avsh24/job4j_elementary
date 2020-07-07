package ru.job4j.collection.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                break;
            } else {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
