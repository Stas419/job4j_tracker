package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {

        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        System.out.println(tracker.findById(2));



//        LocalDateTime currentDateTime = LocalDateTime.now();
//        Item item = new Item();
//        System.out.println(item.getCreated());
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEE-yyyy HH:mm:ss");
//        String currentDateTimeFormat = currentDateTime.format(formatter);
//        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

    }

}
