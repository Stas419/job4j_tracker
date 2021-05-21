package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Здравствуйте, что вы хотите узнать?");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch(answer){
            case 0:
                System.out.println("да");
                break;
            case 1:
                System.out.println("нет");
                break;
            case 2:
                System.out.println("Может быть");
                break;
        }
    }



}
