package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int z) {
        this.x = first;
        this.y = second;
        this.z = z;
    }

    public double distance(Point that) {
        return  sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        int rsl = (this.x * that.x) + (this.y * that.y) + (this.z * that.z);
        return -1D;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println("result (2, 12) to (2, 9) " + dist);
    }

}
