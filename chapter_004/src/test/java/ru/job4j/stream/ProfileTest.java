package ru.job4j.stream;

import org.junit.Test;

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
        List<Address> addresses = profiles.collect(users);
        assertThat(addresses.get(1).getHome(), is(191));
    }
}
