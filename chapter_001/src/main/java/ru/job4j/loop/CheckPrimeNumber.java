package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = true;
        for (int i = 2; i <= (num-1); i++) {
        if ((num % i) == 0) {
            prime = false;
        break;
        } else {continue;}
        }
        return prime;
    }
}