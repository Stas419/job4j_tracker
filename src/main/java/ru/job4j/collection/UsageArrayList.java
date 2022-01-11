package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Cаша");
        list.add("Cемен");
        list.add("Petr");

        for (Object ob : list) {
            System.out.println(ob);
        }
    }
}
