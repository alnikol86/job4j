package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point one = new Point(1, 3);
        Point two = new Point(2, 2);
        double expected = 1.4142135623730951;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}
