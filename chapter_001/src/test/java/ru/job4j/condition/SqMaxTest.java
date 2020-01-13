package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstSqMax() {
        SqMax check = new SqMax();
        int result = check.max(10, 5, 3, 4);
        assertThat(result, is(10));
    }
}
