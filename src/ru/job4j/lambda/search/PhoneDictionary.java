package ru.job4j.lambda.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = k -> k.getName().contains(key);
        Predicate<Person> surname = k -> k.getSurname().contains(key);
        Predicate<Person> phone = k -> k.getPhone().contains(key);
        Predicate<Person> address = k -> k.getAddress().contains(key);
        Predicate<Person> combine = name.or(surname).or(phone).or(address);

            ArrayList<Person> result = new ArrayList<>();
            for (Person person : persons) {
                if (combine.test(person)) {
                    result.add(person);
                }
            }
            return result;
    }
}
