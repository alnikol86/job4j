package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? "
                + System.lineSeparator() + ">>");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        String say;
        if (answer == 0) {
            say = "Да";
        } else if (answer == 1) {
            say = "Нет";
        } else {
            say = "Может быть";
        }
        System.out.println(say);
    }
}
