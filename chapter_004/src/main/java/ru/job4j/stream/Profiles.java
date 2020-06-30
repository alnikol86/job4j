package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        List<Address> customerAdresses = profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return customerAdresses;
    }

    private static Address getAdr(Profile profile) {
        return profile.getAddress();
    }
}
