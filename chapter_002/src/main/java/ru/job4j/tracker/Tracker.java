package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод findAll возвращает коллекцию Items
     * @return коллекция.
     */
    public List<Item> findAll()  {
        return items;
    }

    /**
     * Метод реализующий изменение имени у Item в хранилище
     * @param id по нему будем искать позицию Item, в которой он записан.
     * @param newItem это новый Item котором заменим id на старое. И заменим старый Item на newItem.
     */
    public boolean replace(String id, Item newItem) {
        boolean result = false;
        int index = indexOf(id);
        newItem.setId(items.get(index).getId());
        if (index != -1) {
            items.set(index, newItem);
            result = true;
        }
        return result;
    }

    /**
     * Метод реализующий удаление заявки в хранилище
     * @param id по нему будем искать позицию Item, в которой он записан.
     */
    public boolean delete(String id) {
        Item item = findById(id);
            return items.remove(item);
    }

    /**
     * Метод возвращает index по id
     * @param id по нему будем искать позицию Item в котором он записан.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод findByName проверяет в цикле все элементы массива this.items, сравнивая name c key. Все совпадающие элементы собирает в массив.
     * @param key name, которое ищем среди массива объектов.
     * @return Массив, в который записаны все элементы с name key.
     */
    public List<Item> findByName(String key) {
        List<Item> itemsWithSameName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsWithSameName.add(item);
            }
        }
        return itemsWithSameName;
    }

    /**
     * Метод findById проверяет в цикле все элементы массива this.items, сравнивая id c key. И выдает этот элемент.
     * @return Элемент, id которого совпадает с тем который мы ищем.
     * @param id, id которое ищем среди массива объектов.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index < 0 ? null : items.get(index);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}