package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstSqMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 5, 10, 112);
        assertThat(result, is(112));
    }
}
