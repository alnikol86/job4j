package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euros = rubleToEuro(140);
        int expectedEuros = 2;
        boolean passedE = euros == expectedEuros;

        int dollars = rubleToDollar(120);
        int expectedDollars = 2;
        boolean passedD = dollars == expectedDollars;

        int euToRu = euroToRuble(2);
        int expectedEuToRu = 140;
        boolean passedETR = euToRu == expectedEuToRu;

        int usToRu = dollarToRuble(2);
        int expectedUsToRu = 120;
        boolean passedUTR = usToRu ==expectedUsToRu;

        System.out.println("140 rubles = " + euros + " euros. Test result = " + passedE);
        System.out.println("120 rubles = " + dollars + " dollars. Test result = " + passedD);
        System.out.println("2 euros =" + euToRu + " rubles. Test result = " + passedETR);
        System.out.println("2 dollars = " + usToRu + " rubles. Test result = " + passedUTR);
    }
}
