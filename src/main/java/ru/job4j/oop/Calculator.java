package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int minus(int num1) {
        return num1 - x;
    }

    public int divide(int num2) {
        return  num2 / x;
    }

    public static int multiply(int num3) {
        return num3 * x;
    }

    public int sum(int num4) {
        return num4 + x;
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
