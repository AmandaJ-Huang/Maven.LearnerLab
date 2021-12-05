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
        Integer expected = 2;

        // When
        people.remove(people.toArray()[0]);
        Integer actual = people.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByID() {
        // Given
        People people = Instructors.getInstance();
        Integer expected = 3; //because I added Jerry, George and Elaine in testAdd()

        // When
        people.remove(1L);
        people.remove(2L);
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
