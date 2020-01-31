package ru.job4j.condition;

/**
 * Class a bot
 * @author Alexander Nikolaev
 * @version 1.0
 */

public class DummyBot {
    /**
     * Method hardcoded logic
     * @param question the hardcoded question
     * @return an answer from the bot
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
