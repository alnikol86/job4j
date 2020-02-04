package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже,"
                    + System.lineSeparator()
                    + "К сожалению, день рожденья"
                    + System.lineSeparator()
                    + "Только раз в году.");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки,"
                    + System.lineSeparator()
                    + "Баю – бай…");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox user = new Jukebox();
        user.music(2);
        System.out.println("Next track");
        user.music(1);
        System.out.println("Next track");
        user.music(3);
    }
}
