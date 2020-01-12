package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To1Then2() {
        int result = Max.max(35, 21);
        assertThat(result, is(35));
    }
    @Test
    public void whenMax2To2Then1() {
        int result = Max.max(12, 19);
        assertThat(result, is(19));
    }
    @Test
    public void whenBothIsEqual() {
        int result = Max.max(20, 20);
        assertThat(result, is(20));
    }
}
