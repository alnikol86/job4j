package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                int point = index;
                if (index != 0) {
                    array[0] = array[point];
                }
                index--;
                array[index] = array[point];
                index--;
                while(array[index] != null) {
                    array[index] = array[point];
                    index--;
                }
            }
        }
        return array;
    }
}
