package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                //int point = index;
                //while (index < array.length) {
                    String temp = array[array.length - 1];
                    array[array.length - 1] = array[index];
                    array[index] = temp;
                    //index++;
                //}
            }
        }
        return array;
    }
}
