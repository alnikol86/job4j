package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionsCount {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> results = new ArrayList<>();
        double res = 0;
        for (int i = start; i <= end; i++) {
            double b = i;
            res = func.apply(b);
            results.add(res);
        }
        return results;
    }
}

