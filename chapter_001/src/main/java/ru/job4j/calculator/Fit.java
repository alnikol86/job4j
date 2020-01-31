package ru.job4j.calculator;

/**
 * Class calculate an optimal weight
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class Fit {
    /**
     * Method calculate a weight for a man
     * @param height input a height
     * @return the optimal weight
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    /**
     * Method calculate a weight for a woman
     * @param height input a height
     * @return the optimal weight
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    /**
     * Method main
     * @param args
     */
    public static void main(String[] args) {
        double man = manWeight(175);
        double woman = womanWeight(165);
        System.out.println("Man height 175 his perfect weight = " + man);
        System.out.println("Woman height 165 her perfect weight = " + woman);
    }
}
