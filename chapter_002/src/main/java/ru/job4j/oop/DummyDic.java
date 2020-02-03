package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }
    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String eng = dictionary.engToRus("Hello");
        System.out.println("Неизвестное слово. " + eng);
    }
}
