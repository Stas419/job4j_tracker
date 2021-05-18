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

    public Item[] findAll(Item[] items){
        Item[] itm = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if(item != null){
                itm[i] = item;
                size++;
            }
        }
        itm = Arrays.copyOf(itm, size);
        return itm;
    }

    public Item[] findByName(String key){
        Item[] itm = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if(items[i].getName().equals(key)){
                itm[i] = items[i];
            }
        }
        return itm;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}