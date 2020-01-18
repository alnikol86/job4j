package ru.job4j.calculator;

/**
 * Class Calculator for calculating maths operation + - * /
 * @author Alexander Nikolaev
 * @since January 19, 2020
 * @version 1
 */

public class Calculator {
    /**
     * Addition operation
     * @param first number
     * @param second number
     */
    public static void add(double first, double second){
        double result = first + second;
        System.out.println("add: " + first + " + " + second + " = " + result);
    }

    /**
     * Subtraction operation
     * @param first number
     * @param second number
     */
    public static void subtract(double first, double second){
        double result = first - second;
        System.out.println("subtract: " + first + " - " + second + " = " + result);
    }

    /**
     * Division operation
     * @param first number
     * @param second number
     */
    public static void div(double first, double second){
        double result = first / second;
        System.out.println("div: " + first + " / " + second + " = " + result);
    }

    /**
     * Multiplication operation
     * @param first number
     * @param second number
     */
    public static void multiple(double first, double second){
        double result = first * second;
        System.out.println("multiple: " + first + " * " + second + " = " + result);
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args){
        add(1,1);
        subtract(5,8);
        div(10,4);
        multiple(3,4);
    }
}
