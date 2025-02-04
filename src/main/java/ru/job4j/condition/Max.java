package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return max(middle, max(left, right));
    }

    public static int max(int left, int right, int middle, int x) {
        return max(x, max(left, right, middle));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 5));
    }

}

