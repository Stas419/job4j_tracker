package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(scan.nextLine());
            if (matches <= 3 && matches > 0) {
                turn = !turn;
                count -= matches;
                System.out.println("Осталось - " + (count));
            }
        }
        if (!turn) {
            System.out.println("выйграл первый игрок ");
        } else {
            System.out.println("выйграл второй игрок ");
        }
    }
}
