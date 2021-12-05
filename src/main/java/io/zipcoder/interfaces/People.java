package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList = new ArrayList<>();


    public void add(E element) {
        this.personList.add(element);
    }

    public E findById(long id) {
        for(E element : personList) {
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }

    public Boolean contains(E element) {
        if (personList.contains(element)) {
            return true;
        }
        return false;
    }

    public void remove(E element) {
        this.personList.removeIf(
                persons -> persons.equals(element));
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

    public E[] toArray() {
        return null;
    }


    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
