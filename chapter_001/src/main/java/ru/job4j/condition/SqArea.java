package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double l, h, s;
        // p = 2 (L +h)
        // p / 2 = L+h и L = h * k
        // p / 2 = h *k + h
        // p / 2 = (k + 1) * h;
        h = p / (2 * (k + 1));
        l = h * k;
        s = l * h;
        return s;
    }
    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println("p = 5, k = 2, S = 2, in of real S = " + result);
    }
}
