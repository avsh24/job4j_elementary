package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    static List<Address> collect(List<Profile> profiles, Comparator<Address> comp) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .sorted(comp)
                .distinct()
                .collect(Collectors.toList());
    }
}
