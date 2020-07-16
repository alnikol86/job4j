package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void whenFindByNameSecond() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Alexander", "Nikolaev", "4562158", "Nizhniy Novgorod")
        );
        var persons = phones.find1("Alexander");
        assertThat(persons.get(0).getSurname(), is("Nikolaev"));
    }
}
