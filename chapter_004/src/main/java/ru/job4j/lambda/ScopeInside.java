package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    public void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; ++i) {
            int num = i;
            total = add(
                    () -> {
                        int totalIn = +num;
                        return totalIn;
                    }
            );
        }
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
