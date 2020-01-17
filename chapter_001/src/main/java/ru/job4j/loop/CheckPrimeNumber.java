package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = false;
        if ((num % 2) != 0) {
            prime = true;
        }
        return prime;
    }
}