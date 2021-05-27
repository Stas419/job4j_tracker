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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;

    }

    public boolean replace(Item item, int id){
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(index);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public  boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
            if(index != -1){
                System.arraycopy(items, index + 1, items, index,size - index - 1 );
                items[size - 1] = null;
                size--;
                rsl = true;
            }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }






}