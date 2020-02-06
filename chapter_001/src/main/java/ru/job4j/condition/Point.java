package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    /**
     * It is the fields for the object
     */
    private int x;
    private int y;
    private int z;

    /**
     * A constructor for a start position
     * @param first X coordinate
     * @param second Y coordinate
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public  Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

public static void main(String[] args) {
        Point one1 = new Point(1, 3);
        Point two1 = new Point(2, 2);
        System.out.println("Distance1 = " + one1.distance(two1));

        Point one2 = new Point(5, 9);
        Point two2 = new Point(4, 7);
        System.out.println("Distance2 = " + one2.distance(two2));

        Point one3 = new Point(6, 2);
        Point two3 = new Point(5, 1);
        System.out.println("Distance3 = " + one3.distance(two3));

        Point one4 = new Point(9, 5);
        Point two4 = new Point(4, 5);
        System.out.println("Distance4 = " + one4.distance(two4));

        Point one5 = new Point(9, 5, 6);
        Point two5 = new Point(4, 5, 2);
        System.out.println("distance3D = " + one5.distance3d(two5));
    }
}