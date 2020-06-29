package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void whenGetAdresses() {
        Profiles profiles = new Profiles();
        List<Profile> users = Arrays.asList(
                new Profile(new Address("Nizhny Novgorod", "Gorkogo", 190, 77)),
                new Profile(new Address("Nizhny Novgorod", "Gorkogo", 191, 78)),
                new Profile(new Address("Nizhny Novgorod", "Gorkogo", 192, 79))
        );
        System.out.println(profiles.collect(users));
//        Address expected = "[Address{city='Nizhny Novgorod', street='Gorkogo', home=190, apartment=77},"
//                + "Address{city='Nizhny Novgorod', street='Gorkogo', home=191, apartment=78},"
//                + "Address{city='Nizhny Novgorod', street='Gorkogo', home=192, apartment=79}]";
//        assertThat(profiles.collect(users), is(expected));
    }
}
