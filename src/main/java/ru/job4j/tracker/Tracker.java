package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
//    private final Item[] items = new Item[100];
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public ArrayList<Item> findAll() {
        return (ArrayList<Item>) items.clone();

    }

    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i).equals(key)) {
                result.add(items.get(i));
            }
        }
        return  Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        int rsl = indexOf(id);
        return rsl != -1 ? items.get(rsl) : null;
        }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.add(item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(id);
        }
        return rsl;
    }
}