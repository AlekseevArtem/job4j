package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод findAll возвращает копию массива this.items без null элементов
     * @return Массив без null елементов.
     */
    public Item[] findAll()  {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод реализующий изменение имени у Item в хранилище
     * @param id по нему будем искать позицию Item, в которой он записан.
     * @param newItem это новый Item котором заменим id на старое. И заменим старый Item на newItem.
     */
    public Item replace(String id, Item newItem) {
        int indexOfId = indexOf(id);
        newItem.setId(items[indexOfId].getId());
        this.items[indexOfId] = newItem;
        return newItem;
    }

    /**
     * Метод реализующий удаление заявки в хранилище
     * @param id по нему будем искать позицию Item, в которой он записан.
     */
    public void delete(String id) {
        int distPos = indexOf(id);
        int size = position - distPos;
        this.items[distPos] = null;
        System.arraycopy(items, distPos + 1, this.items, distPos, size);
        this.items[position] = null;
        this.position--;
    }

    /**
     * Метод возвращает index по id
     * @param id по нему будем искать позицию Item в котором он записан.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
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
    public Item[] findByName(String key) {
        Item[] itemsWithSameName = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (items[index].getName() != null && items[index].getName().equals(key)) {
                itemsWithSameName[size++] = items[index];
            }
        }
        itemsWithSameName = Arrays.copyOf(itemsWithSameName, size);
        return itemsWithSameName;
    }

    /**
     * Метод findById проверяет в цикле все элементы массива this.items, сравнивая id c key. И выдает этот элемент.
     * @return Элемент, id которого совпадает с тем который мы ищем.
     * @param id, id которое ищем среди массива объектов.
     */
    public Item findById(String id) {
        return items[indexOf(id)];
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