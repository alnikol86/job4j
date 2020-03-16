package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static int input(String player) {
        Scanner input = new Scanner(System.in);
        System.out.println(player + " start the game!");
        int value = Integer.valueOf(input.nextLine());
        while (value < 0 || value > 3) {
            System.out.println("You must inter number 1, 2, or 3");
            value = Integer.valueOf(input.nextLine());
        }
        return value;
    }

    public static int counterDecrement(int counter, int input) {
        counter = counter - input;
        return counter;
    }

    public static void game(int counter, String player) {
        if (counter != 0) {
            System.out.println(counter);
        }
        if (counter <= 0) {
            System.out.println(player + " is WIN!!! "
                    + System.lineSeparator() + "The game finished!");
        }
    }

    public static void main(String[]args) {
        String player1 = "Player1";
        String player2 = "Player2";
        int count = 11;
        boolean run = true;
        while (run) {
            count = counterDecrement(count, input(player1));
            game(count, player1);
            if (count <= 0) {
                break;
            }
            count = counterDecrement(count, input(player2));
            game(count, player2);
            if (count <= 0) {
                break;
            }
        }
    }
}