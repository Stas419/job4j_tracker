package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] withoutZeros = new Item[size];
        for (int i = 0; i < size; i++) {
            withoutZeros[i] = items[i];
        }
        withoutZeros = Arrays.copyOf(withoutZeros, size);
        return withoutZeros;
    }

    public Item[] findByName(String key) {
        Item[] withoutZeros = new Item[size];
        for (int i = 0; i < size; i++) {
            Item check = items[i];
            if (check.getName() == key) {
                withoutZeros[i] = items[i];
                break;
            }
        }
        withoutZeros = Arrays.copyOf(withoutZeros, size);
        return withoutZeros;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[size];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
     }
}