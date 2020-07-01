package ru.job4j.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Profile> sorted(List<Profile> profiles) {
        Collections.sort(profiles, new ProfileCompareByAddress());
        return profiles;
    }

    List<Address> collect(List<Profile> profiles) {
        Profiles profiles1 = new Profiles();
        List<Address> addresses = profiles1.sorted(profiles)
                .stream()
                .map(Profile::getAddress)
                .distinct()
                .collect(Collectors.toList());
        return addresses;
    }

    private static Address getAdr(Profile profile) {
        return profile.getAddress();
    }
}
