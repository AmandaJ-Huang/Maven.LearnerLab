package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
    private List<Person> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById (long id) {
        for(Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(Person person) {
        this.personList.removeIf(
                persons -> persons.equals(person));
    }

    public void remove(long id) {
        this.personList.removeIf(
                person -> person.getId() == id);
    }

    public void removeAll() {
        this.personList.clear();
    }

    public Integer count() {
        return this.personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }


}
