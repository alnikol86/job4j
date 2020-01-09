package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int inX1 = 1;
        int inY1 = 3;
        int inX2 = 2;
        int inY2 = 2;
        double expected = 4.0;
        double out = Point.distance(inX1, inX2, inY1, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
