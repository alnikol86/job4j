package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConvertMatrixTest {
    @Test
    public void whenConvertMatrix() {
        Integer[][] integers = {{1, 2}, {3, 4}};
        ConvertMatrix convertMatrix = new ConvertMatrix();
        List<Integer> expected = Arrays.asList(
                1, 2, 3, 4
        );
        assertThat(convertMatrix.convert(integers), is(expected));
    }
}
