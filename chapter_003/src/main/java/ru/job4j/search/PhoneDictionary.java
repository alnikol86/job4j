package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var i = 0; i < persons.size(); ++i) {
            if (persons.get(i).getName().contains(key)
                    || persons.get(i).getSurname().contains(key)
                    || persons.get(i).getPhone().contains(key)
                    || persons.get(i).getAddress().contains(key)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }

    public ArrayList<Person> find1(String key) {
        Predicate<Person> name = nameField -> nameField.getName().contains(key);
        Predicate<Person> surname = surnameField -> surnameField.getSurname().contains(key);
        Predicate<Person> phone = phoneField -> phoneField.getPhone().contains(key);
        Predicate<Person> address = addressField -> addressField.getAddress().contains(key);
        Predicate<Person> combine = person1 -> name.or(surname).or(phone).or(address).test(person1);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            name.test(person);
            surname.test(person);
            phone.test(person);
            address.test(person);
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
