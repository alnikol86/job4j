package ru.job4j.lambda;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

public class FunctionsCountTest {
    @Test
    public void whenLinearFunctionThenLinearResult() {
        FunctionsCount function = new FunctionsCount();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenSquarerFunctionThenSquarerResult() {
        FunctionsCount function = new FunctionsCount();
        List<Double> result = function.diapason(5, 8, x -> 1 * (x * x) + 1 * x + 1);
        List<Double> expected = Arrays.asList(31D, 43D, 57D, 73D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenExponencialerFunctionThenExponencialerResult() {
        FunctionsCount function = new FunctionsCount();
        List<Double> result = function.diapason(5, 8, x -> 1 * x);
        List<Double> expected = Arrays.asList(5D, 6D, 7D, 8D);
        assertThat(result, is(expected));
    }
}
