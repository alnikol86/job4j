package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point one = new Point(1, 3);
        Point two = new Point(2, 2);
        double expected = 1.41;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance3D() {
        Point one = new Point(4, 3, 2);
        Point two = new Point(1, 6, 3);
        Point three = new Point(2, 4, 3);
        double expected = 4.35;
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}
