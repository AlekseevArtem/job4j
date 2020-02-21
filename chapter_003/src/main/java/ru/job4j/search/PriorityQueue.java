package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() <= tasks.size() && task.getPriority() > 0) {
                index = task.getPriority() - 1;
            } else if (element != null) {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}