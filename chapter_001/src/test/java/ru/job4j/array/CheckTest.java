package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenAllelementsTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenOneElementFalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
