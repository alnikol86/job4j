package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        List<Address> customerAdresses = profiles.stream()
                .map(new Function<Profile, Address>() {
                    @Override
                    public Address apply(Profile profile) {
                        return profile.getAddress();
                    }
                })
                .collect(Collectors.toList());
        return customerAdresses;
    }
}
