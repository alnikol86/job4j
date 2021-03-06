package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotEndWithPrefixthenElse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'o', 'l'};
        boolean result = EndWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
