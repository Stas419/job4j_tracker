package ru.job4j.tracker;
import java.util.Scanner;
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    private ConsoleInput input;

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    private boolean isNumber(String value) {
        boolean rsl = true;
        char[] check = value.toCharArray();
        for (char num : check) {
            if (num < 48 || num > 57) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            String rsl = input.askStr(question);
            if (!isNumber(rsl)) {
                System.out.println("Please enter validate data again.");
                continue;
            }
            value = Integer.parseInt(rsl);
            invalid = false;
        } while (invalid);
        return value;
    }
}
