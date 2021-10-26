package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {
    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = -1;
        double out = X2.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }


    @Test
    public void when00to20then3(){
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double expected = -1;
        double out = X2.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }


}