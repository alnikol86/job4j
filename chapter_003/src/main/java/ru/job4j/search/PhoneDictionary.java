package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); ++i) {
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
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            Predicate<Person> name = nameField -> person.getName().contains(key);
            Predicate<Person> surname = surnameField -> person.getSurname().contains(key);
            Predicate<Person> phone = phoneField -> person.getPhone().contains(key);
            Predicate<Person> address = addressField -> person.getAddress().contains(key);
            Predicate<Person> combine = person1 -> name.or(surname).or(phone).or(address).test(person);
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
