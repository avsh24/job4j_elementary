package ru.job4j.collection.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
//        ArrayList<Person> result = new ArrayList<>();
        var result = new List.of(2, 4, 3, 4);
        for (var person : persons) {
            if (person.getName().contains(key)
                || person.getSurname().contains(key)
                || person.getPhone().contains(key)
                || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
