package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        Person person = new Person(1, "Smitty Werbenjägermanjensen");

        // When
        long actualId = person.getId();
        String actualName = person.getName();

        // Then
        Assert.assertEquals(1, actualId);
        Assert.assertEquals("Smitty Werbenjägermanjensen", actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person(1, "Smitty Werbenjägermanjensen");
        String expected = "Smitty";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
