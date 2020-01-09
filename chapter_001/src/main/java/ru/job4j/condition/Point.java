package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.pow(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2), 2);
    }
    public static void main(String[] args) {
        double distance1 = distance(1, 2, 3, 2);
        double distance2 = distance(5, 4, 9, 7);
        double distance3 = distance(6, 5, 2, 1);
        double distance4 = distance(9, 4, 5, 5);
        System.out.println("Distance1 = " + distance1);
        System.out.println("Distance2 = " + distance2);
        System.out.println("Distance3 = " + distance3);
        System.out.println("Distance4 = " + distance4);
    }
}
