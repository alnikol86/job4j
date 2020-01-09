package ru.job4j.calculator;

public class Calculator {
    public static void add(double first, double second){
        double result = first + second;
        System.out.println("add: " + first + " + " + second + " = " + result);
    }
    public static void subtract(double first, double second){
        double result = first - second;
        System.out.println("subtract: " + first + " - " + second + " = " + result);
    }
    public static void div(double first, double second){
        double result = first / second;
        System.out.println("div: " + first + " / " + second + " = " + result);
    }
    public static void multiple(double first, double second){
        double result = first * second;
        System.out.println("multiple: " + first + " * " + second + " = " + result);
    }

    public static void main(String[] args){
        add(1,1);
        subtract(5,8);
        div(10,4);
        multiple(3,4);
    }
}
