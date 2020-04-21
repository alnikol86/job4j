package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(Input input) {
        this.input = input;
    }

    public String ascStr(String question) {
        return input.ascStr(question);
    }

    public int ascInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = input.ascInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

    public int ascInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = input.ascInt(question, max);
                invalid = false;
            } catch (IllegalStateException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
