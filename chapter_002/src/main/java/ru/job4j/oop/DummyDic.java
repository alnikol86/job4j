package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }
    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        dictionary.engToRus("hello");
        System.out.println("Неизвестное слово. " + dictionary);
    }
}
