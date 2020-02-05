package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = 0; // to do
        if (this.exist(a, b, c)) {
            //square triangle
            rsl = -1;
        }
        return rsl;
    }


    public static boolean exist(double ab, double ac, double bc) {
        boolean condition = ab + ac > bc && ab + bc > ac && ac + bc > ab;
        return condition;
    }
}
