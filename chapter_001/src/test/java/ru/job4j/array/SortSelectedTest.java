package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortThree() {
        int[] input = {5, 1, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 5, 9};
        assertThat(result, is(expect));
    }
}
