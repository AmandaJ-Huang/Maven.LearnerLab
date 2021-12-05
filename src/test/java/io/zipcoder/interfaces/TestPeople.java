package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        // Given
        People people = Instructors.getInstance();
        Person jerry = new Person(2, "Jerry");
        Person elaine = new Person(3, "Elaine");
        Person george = new Person(4, "George");

        // When
        people.add(jerry);
        people.add(george);

        Boolean actualJerry = people.contains(jerry);
        Boolean actualElaine = people.contains(elaine);
        Boolean actualGeorge = people.contains(george);

        // Then
        Assert.assertTrue(actualJerry);
        Assert.assertFalse(actualElaine);
        Assert.assertTrue(actualGeorge);
    }

    @Test
    public void testRemoveByPerson() {
        // Given
        People people = Instructors.getInstance();
        long id = 123;
        String name = "Elaine";
        Person elaine = new Person(id, name);
        Integer expected = 0;

        // When
        people.add(elaine);
        people.remove(elaine);
        Integer actual = people.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByID() {
        // Given
        People people = Instructors.getInstance();
        long id = 123;
        String name = "Elaine";
        Person elaine = new Person(id, name);
        Integer expected = 0;

        // When
        people.add(elaine);
        people.remove(id);
        Integer actual = people.count();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindById() {
        // Given
        People people = Instructors.getInstance();
        long id = 123;
        String name = "Elaine";
        Person elaine = new Person(id, name);

        // When
        people.add(elaine);
        Person actual = people.findById(id);

        // Then
        Assert.assertEquals(elaine, actual);
    }
}
