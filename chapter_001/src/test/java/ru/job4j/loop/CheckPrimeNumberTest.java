package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class  CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }
    @Test
    public void when4() {
        boolean rs1 = CheckPrimeNumber.check(4);
        assertThat(rs1, is(false));
    }
}
