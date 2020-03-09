package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        while (run) {
            System.out.println("Player1 start the game!");
            int value = Integer.valueOf(input.nextLine());
            while (value < 0 | value > 3) {
                System.out.println("You must inter number 1, 2, or 3");
                value = Integer.valueOf(input.nextLine());
            }
            if (count != 0) {
                count = count - value;
                System.out.println(count);
            }
            if (count == 0) {
                System.out.println("Player1 is WIN!!! "
                        + System.lineSeparator() + "The game finished!");
                run = false;
                break;
            }
            System.out.println("Player2 start the game!");
            value = Integer.valueOf(input.nextLine());
            while (value < 0 | value > 3) {
                System.out.println("You must inter number 1, 2, or 3");
                value = Integer.valueOf(input.nextLine());
            }
            if (count != 0) {
                count = count - value;
                System.out.println(count);
            }
            if (count == 0) {
                System.out.println("Player2 is WIN!!!"
                + System.lineSeparator() + "The game finished!");
                run = false;
            }
        }
    }
}
