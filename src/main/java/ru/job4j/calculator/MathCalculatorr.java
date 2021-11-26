package ru.job4j.calculator;
import static ru.job4j.math.MathFunctionn.*;

public class MathCalculatorr {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferencAndDivision(double first, double second) {
       return difference(first, second) + division(first, second);
    }

    public static double sumOfAllTransactions(double first, double second) {
        return sumAndMultiply(first, second) + sumDifferencAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("результат расчета равен: " + MathCalculatorr.sumAndMultiply(10, 20));
        System.out.println("результат расчета равен: "
                + MathCalculatorr.sumOfAllTransactions(23, 15));
        System.out.println("результат расчета равен: "
                + MathCalculatorr.sumDifferencAndDivision(20, 19));
    }
}
