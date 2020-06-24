package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionsCount {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> results = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            double b = i;
            results.add(func.apply(b));
        }
        return results;
    }
}

