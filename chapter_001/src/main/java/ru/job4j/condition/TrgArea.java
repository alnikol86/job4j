package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.pow(p * (p - a) * (p - b) * (p - c), 2);
        return s;
    }
    public static void main(String[] args) {
        double result1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2,2,2) = " + result1);
    }
}
