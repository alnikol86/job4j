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

    public static int counterDecrement(int counter, int input, String player) {
        counter = counter - input;
        if (counter <= 0) {
            System.out.println(player + " is WIN!!! "
                    + System.lineSeparator() + "The game finished!");
        }
        return counter;
    }

    public static void game(int counter, String player) {
        if (counter != 0) {
            System.out.println(counter);
        }
    }

    public static void main(String[]args) {
        String player1 = "Player1";
        String player2 = "Player2";
        int playerNumber = 0;
        int count = 11;
        while (count > 0) {
            String currentPlayer = ++playerNumber % 2 == 1 ? player1 : player2;
            game(count, currentPlayer);
            count = counterDecrement(count, input(currentPlayer), currentPlayer);
        }
    }
}