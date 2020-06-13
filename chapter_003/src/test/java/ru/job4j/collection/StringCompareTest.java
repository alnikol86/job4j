package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualsThenZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Ivanov", "Ivanov");
        assertThat(rsl, is(0));
    }
    @Test
    public void whenLeftLessThanRightResultBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Ivanov", "Ivanova");
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Petrov", "Ivanova");
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Petrov", "Patrov");
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void secondCharOfLeftLessThatRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Patrova", "Petrov");
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenLeftGreaterThenRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Petrova", "Petrov");
        assertThat(rsl, lessThan(0));
    }
}
