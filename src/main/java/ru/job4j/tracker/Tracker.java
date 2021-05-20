package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(Item[] items){
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key){
        Item[] itm = new Item[size];
        int cnt = 0;
        for (int i = 0; i < size; i++) {
            if(items[i].getName().equals(key)){
                itm[cnt++] = items[i];
            }
        }
        return Arrays.copyOf(itm, cnt);
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

    public boolean replace(Item items, int id){
        boolean rsl = false;
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i].getId() == indexOf(id)){
                this.items[i] = items;
                rsl = true;
            }
        }
        return true;
    }
}