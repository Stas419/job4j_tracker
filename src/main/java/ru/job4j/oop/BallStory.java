package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        wolf.tryRun(ball);
        fox.tryEat(ball);
        hare.tryRun(ball);
    }
}
