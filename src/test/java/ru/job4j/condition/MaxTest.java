package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class MaxTest {
    @Test
    public void max() {
        int left = 3;
        int right = 5;
        int middle = 9;
        int expected = 9;
        int rsl = Max.max(left, right, middle);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void testMax() {
        int left = 2;
        int right = 5;
        int expected = 5;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }
}