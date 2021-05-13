package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Меня зовут "+this.name+"." + " Я ем "+this.food+".");
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick){
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.giveNick("Гав");
        peppy.eat("мясо");
        peppy.show();
    }
}
