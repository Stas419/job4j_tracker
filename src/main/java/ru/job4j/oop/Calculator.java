package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return  num / x;
    }

    public static int multiply(int num) {
        return num * x;
    }

    public int sum(int num) {
        return num + x;
    }

    public int sumAllOperation(int num) {
        return minus(2) + divide(3) + multiply(6) + sum(3) + num;
    }

    public  static void main(String[] args) {
        int minus = minus(2);
        Calculator calculator = new Calculator();
        int divide = calculator.divide(3);
        int multiply = multiply(6);
        int sum = calculator.sum(3);
    }
}
