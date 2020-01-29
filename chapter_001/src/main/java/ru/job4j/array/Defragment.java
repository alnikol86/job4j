package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                String nullData = array[index];
                int tempNull = index;
                while(array[index] == null && index < array.length - 1) {
                    index++;
                }
                String data = array[index];
                array[tempNull] = data;
                array[index] = nullData;
                index = tempNull;
            }
        }
        return array;
    }
}
