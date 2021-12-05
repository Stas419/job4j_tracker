package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String plaer = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(plaer + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4) {
                count = count - matches;
                System.out.println("осталось " + count +  "спичек");
            } else {
                System.out.println("вы ввели не верное число игра закончена");
                break;
            }

            turn = !turn;
        }
        if (!turn) {
            System.out.println("выйграл первый игрок");
        } else {
            System.out.println("выйграл второй игрок");
        }
    }
}
