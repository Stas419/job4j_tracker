package ru.job4j.condition;

public class Game {
    public static double checkGame(double percent, int prize, int pay) {
        double sum;
        if (percent + prize > pay) {
            sum =  prize - percent;
        } else {
            sum = 0;
        }
        return sum;
    }
}
