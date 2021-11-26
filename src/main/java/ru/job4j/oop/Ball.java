package ru.job4j.oop;

public class Ball {
    public  void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("съеден");
        } else if (condition != true) {
            System.out.println("убежал");
        }
    }
}
